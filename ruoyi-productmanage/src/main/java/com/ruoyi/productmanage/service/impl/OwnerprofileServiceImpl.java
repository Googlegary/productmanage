package com.ruoyi.productmanage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productmanage.mapper.OwnerprofileMapper;
import com.ruoyi.productmanage.domain.Ownerprofile;
import com.ruoyi.productmanage.service.IOwnerprofileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 捐赠人资料Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
@Service
public class OwnerprofileServiceImpl implements IOwnerprofileService 
{
    @Autowired
    private OwnerprofileMapper ownerprofileMapper;

    /**
     * 查询捐赠人资料
     * 
     * @param pOwnerId 捐赠人资料主键
     * @return 捐赠人资料
     */
    @Override
    public Ownerprofile selectOwnerprofileByPOwnerId(Long pOwnerId)
    {
        return ownerprofileMapper.selectOwnerprofileByPOwnerId(pOwnerId);
    }

    /**
     * 查询捐赠人资料列表
     * 
     * @param ownerprofile 捐赠人资料
     * @return 捐赠人资料
     */
    @Override
    public List<Ownerprofile> selectOwnerprofileList(Ownerprofile ownerprofile)
    {
        return ownerprofileMapper.selectOwnerprofileList(ownerprofile);
    }

    /**
     * 新增捐赠人资料
     * 
     * @param ownerprofile 捐赠人资料
     * @return 结果
     */
    @Override
    public int insertOwnerprofile(Ownerprofile ownerprofile)
    {
        return ownerprofileMapper.insertOwnerprofile(ownerprofile);
    }

    /**
     * 修改捐赠人资料
     * 
     * @param ownerprofile 捐赠人资料
     * @return 结果
     */
    @Override
    public int updateOwnerprofile(Ownerprofile ownerprofile)
    {
        return ownerprofileMapper.updateOwnerprofile(ownerprofile);
    }

    /**
     * 批量删除捐赠人资料
     * 
     * @param pOwnerIds 需要删除的捐赠人资料主键
     * @return 结果
     */
    @Override
    public int deleteOwnerprofileByPOwnerIds(String pOwnerIds)
    {
        return ownerprofileMapper.deleteOwnerprofileByPOwnerIds(Convert.toStrArray(pOwnerIds));
    }

    /**
     * 删除捐赠人资料信息
     * 
     * @param pOwnerId 捐赠人资料主键
     * @return 结果
     */
    @Override
    public int deleteOwnerprofileByPOwnerId(Long pOwnerId)
    {
        return ownerprofileMapper.deleteOwnerprofileByPOwnerId(pOwnerId);
    }
}
