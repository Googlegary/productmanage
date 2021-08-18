package com.ruoyi.productmanage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 捐赠人资料对象 ownerprofile
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
public class Ownerprofile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 物资所属人编号 */
    private Long pOwnerId;

    /** 物资所属人姓名 */
    @Excel(name = "物资所属人姓名")
    private String pOwnerName;

    /** 物资所属人性别 */
    @Excel(name = "物资所属人性别")
    private String pOwnerGender;

    /** 物资所属人电话 */
    @Excel(name = "物资所属人电话")
    private String pOwnerPhone;

    /** 物资所属人邮箱 */
    @Excel(name = "物资所属人邮箱")
    private String pOwnerEmail;

    /** 物品编号 */
    @Excel(name = "物品编号")
    private Long pId;

    /** 物品接收人编号 */
    @Excel(name = "物品接收人编号")
    private Long pGetId;

    public void setpOwnerId(Long pOwnerId) 
    {
        this.pOwnerId = pOwnerId;
    }

    public Long getpOwnerId() 
    {
        return pOwnerId;
    }
    public void setpOwnerName(String pOwnerName) 
    {
        this.pOwnerName = pOwnerName;
    }

    public String getpOwnerName() 
    {
        return pOwnerName;
    }
    public void setpOwnerGender(String pOwnerGender) 
    {
        this.pOwnerGender = pOwnerGender;
    }

    public String getpOwnerGender() 
    {
        return pOwnerGender;
    }
    public void setpOwnerPhone(String pOwnerPhone) 
    {
        this.pOwnerPhone = pOwnerPhone;
    }

    public String getpOwnerPhone() 
    {
        return pOwnerPhone;
    }
    public void setpOwnerEmail(String pOwnerEmail) 
    {
        this.pOwnerEmail = pOwnerEmail;
    }

    public String getpOwnerEmail() 
    {
        return pOwnerEmail;
    }
    public void setpId(Long pId) 
    {
        this.pId = pId;
    }

    public Long getpId() 
    {
        return pId;
    }
    public void setpGetId(Long pGetId) 
    {
        this.pGetId = pGetId;
    }

    public Long getpGetId() 
    {
        return pGetId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pOwnerId", getpOwnerId())
            .append("pOwnerName", getpOwnerName())
            .append("pOwnerGender", getpOwnerGender())
            .append("pOwnerPhone", getpOwnerPhone())
            .append("pOwnerEmail", getpOwnerEmail())
            .append("pId", getpId())
            .append("pGetId", getpGetId())
            .toString();
    }
}
