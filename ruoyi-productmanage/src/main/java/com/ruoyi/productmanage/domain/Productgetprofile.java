package com.ruoyi.productmanage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 受赠人资料对象 productgetprofile
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
public class Productgetprofile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 物品接收人编号 */
    private Long pGetId;

    /** 物品编号 */
    @Excel(name = "物品编号")
    private Long pId;

    /** 物品所属人编号 */
    @Excel(name = "物品所属人编号")
    private Long pOwnerId;

    /** 物品接收人姓名 */
    @Excel(name = "物品接收人姓名")
    private String pGetName;

    /** 物品接收人电话 */
    @Excel(name = "物品接收人电话")
    private String pGetMobile;

    /** 物品接收人性别 */
    @Excel(name = "物品接收人性别")
    private String pGetGender;

    public void setpGetId(Long pGetId) 
    {
        this.pGetId = pGetId;
    }

    public Long getpGetId() 
    {
        return pGetId;
    }
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
    public void setpGetName(String pGetName) 
    {
        this.pGetName = pGetName;
    }

    public String getpGetName() 
    {
        return pGetName;
    }
    public void setpGetMobile(String pGetMobile) 
    {
        this.pGetMobile = pGetMobile;
    }

    public String getpGetMobile() 
    {
        return pGetMobile;
    }
    public void setpGetGender(String pGetGender) 
    {
        this.pGetGender = pGetGender;
    }

    public String getpGetGender() 
    {
        return pGetGender;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pGetId", getpGetId())
            .append("pId", getpId())
            .append("pOwnerId", getpOwnerId())
            .append("pGetName", getpGetName())
            .append("pGetMobile", getpGetMobile())
            .append("pGetGender", getpGetGender())
            .toString();
    }
}
