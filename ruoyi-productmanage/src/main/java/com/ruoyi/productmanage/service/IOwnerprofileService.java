package com.ruoyi.productmanage.service;

import java.util.List;
import com.ruoyi.productmanage.domain.Ownerprofile;

/**
 * 捐赠人资料Service接口
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
public interface IOwnerprofileService 
{
    /**
     * 查询捐赠人资料
     * 
     * @param pOwnerId 捐赠人资料主键
     * @return 捐赠人资料
     */
    public Ownerprofile selectOwnerprofileByPOwnerId(Long pOwnerId);

    /**
     * 查询捐赠人资料列表
     * 
     * @param ownerprofile 捐赠人资料
     * @return 捐赠人资料集合
     */
    public List<Ownerprofile> selectOwnerprofileList(Ownerprofile ownerprofile);

    /**
     * 新增捐赠人资料
     * 
     * @param ownerprofile 捐赠人资料
     * @return 结果
     */
    public int insertOwnerprofile(Ownerprofile ownerprofile);

    /**
     * 修改捐赠人资料
     * 
     * @param ownerprofile 捐赠人资料
     * @return 结果
     */
    public int updateOwnerprofile(Ownerprofile ownerprofile);

    /**
     * 批量删除捐赠人资料
     * 
     * @param pOwnerIds 需要删除的捐赠人资料主键集合
     * @return 结果
     */
    public int deleteOwnerprofileByPOwnerIds(String pOwnerIds);

    /**
     * 删除捐赠人资料信息
     * 
     * @param pOwnerId 捐赠人资料主键
     * @return 结果
     */
    public int deleteOwnerprofileByPOwnerId(Long pOwnerId);
}
