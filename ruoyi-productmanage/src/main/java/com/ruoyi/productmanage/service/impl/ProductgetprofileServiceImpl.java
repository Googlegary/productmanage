package com.ruoyi.productmanage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productmanage.mapper.ProductgetprofileMapper;
import com.ruoyi.productmanage.domain.Productgetprofile;
import com.ruoyi.productmanage.service.IProductgetprofileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 受赠人资料Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
@Service
public class ProductgetprofileServiceImpl implements IProductgetprofileService 
{
    @Autowired
    private ProductgetprofileMapper productgetprofileMapper;

    /**
     * 查询受赠人资料
     * 
     * @param pGetId 受赠人资料主键
     * @return 受赠人资料
     */
    @Override
    public Productgetprofile selectProductgetprofileByPGetId(Long pGetId)
    {
        return productgetprofileMapper.selectProductgetprofileByPGetId(pGetId);
    }

    /**
     * 查询受赠人资料列表
     * 
     * @param productgetprofile 受赠人资料
     * @return 受赠人资料
     */
    @Override
    public List<Productgetprofile> selectProductgetprofileList(Productgetprofile productgetprofile)
    {
        return productgetprofileMapper.selectProductgetprofileList(productgetprofile);
    }

    /**
     * 新增受赠人资料
     * 
     * @param productgetprofile 受赠人资料
     * @return 结果
     */
    @Override
    public int insertProductgetprofile(Productgetprofile productgetprofile)
    {
        return productgetprofileMapper.insertProductgetprofile(productgetprofile);
    }

    /**
     * 修改受赠人资料
     * 
     * @param productgetprofile 受赠人资料
     * @return 结果
     */
    @Override
    public int updateProductgetprofile(Productgetprofile productgetprofile)
    {
        return productgetprofileMapper.updateProductgetprofile(productgetprofile);
    }

    /**
     * 批量删除受赠人资料
     * 
     * @param pGetIds 需要删除的受赠人资料主键
     * @return 结果
     */
    @Override
    public int deleteProductgetprofileByPGetIds(String pGetIds)
    {
        return productgetprofileMapper.deleteProductgetprofileByPGetIds(Convert.toStrArray(pGetIds));
    }

    /**
     * 删除受赠人资料信息
     * 
     * @param pGetId 受赠人资料主键
     * @return 结果
     */
    @Override
    public int deleteProductgetprofileByPGetId(Long pGetId)
    {
        return productgetprofileMapper.deleteProductgetprofileByPGetId(pGetId);
    }
}
