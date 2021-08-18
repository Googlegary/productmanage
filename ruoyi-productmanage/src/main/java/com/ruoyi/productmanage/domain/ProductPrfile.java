package com.ruoyi.productmanage.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 物资资料对象 product_prfile
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
public class ProductPrfile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 物品编号 */
    private Long pId;

    /** 物品所属人编号 */
    @Excel(name = "物品所属人编号")
    private Long pOwnerId;

    /** 物品接收人编号 */
    @Excel(name = "物品接收人编号")
    private Long pGetId;

    /** 物品名称 */
    @Excel(name = "物品名称")
    private String pName;

    /** 物品类型 */
    @Excel(name = "物品类型")
    private String pType;

    /** 物品状态 */
    @Excel(name = "物品状态")
    private String pStatus;

    /** 物品价格 */
    @Excel(name = "物品价格")
    private BigDecimal pPrice;

    /** 物品时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "物品时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date pTime;

    /** 捐赠人资料信息 */
    private List<Ownerprofile> ownerprofileList;

    public void setpId(Long pId) 
    {
        this.pId = pId;
    }

    public Long getpId() 
    {
        return pId;
    }
    public void setpOwnerId(Long pOwnerId) 
    {
        this.pOwnerId = pOwnerId;
    }

    public Long getpOwnerId() 
    {
        return pOwnerId;
    }
    public void setpGetId(Long pGetId) 
    {
        this.pGetId = pGetId;
    }

    public Long getpGetId() 
    {
        return pGetId;
    }
    public void setpName(String pName) 
    {
        this.pName = pName;
    }

    public String getpName() 
    {
        return pName;
    }
    public void setpType(String pType) 
    {
        this.pType = pType;
    }

    public String getpType() 
    {
        return pType;
    }
    public void setpStatus(String pStatus) 
    {
        this.pStatus = pStatus;
    }

    public String getpStatus() 
    {
        return pStatus;
    }
    public void setpPrice(BigDecimal pPrice) 
    {
        this.pPrice = pPrice;
    }

    public BigDecimal getpPrice() 
    {
        return pPrice;
    }
    public void setpTime(Date pTime) 
    {
        this.pTime = pTime;
    }

    public Date getpTime() 
    {
        return pTime;
    }

    public List<Ownerprofile> getOwnerprofileList()
    {
        return ownerprofileList;
    }

    public void setOwnerprofileList(List<Ownerprofile> ownerprofileList)
    {
        this.ownerprofileList = ownerprofileList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pId", getpId())
            .append("pOwnerId", getpOwnerId())
            .append("pGetId", getpGetId())
            .append("pName", getpName())
            .append("pType", getpType())
            .append("pStatus", getpStatus())
            .append("pPrice", getpPrice())
            .append("pTime", getpTime())
            .append("ownerprofileList", getOwnerprofileList())
            .toString();
    }
}
