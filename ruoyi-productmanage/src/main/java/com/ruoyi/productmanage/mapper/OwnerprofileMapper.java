package com.ruoyi.productmanage.mapper;

import java.util.List;
import com.ruoyi.productmanage.domain.Ownerprofile;

/**
 * 捐赠人资料Mapper接口
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
public interface OwnerprofileMapper 
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
     * 删除捐赠人资料
     * 
     * @param pOwnerId 捐赠人资料主键
     * @return 结果
     */
    public int deleteOwnerprofileByPOwnerId(Long pOwnerId);

    /**
     * 批量删除捐赠人资料
     * 
     * @param pOwnerIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOwnerprofileByPOwnerIds(String[] pOwnerIds);
}
