package com.ruoyi.productmanage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.productmanage.domain.Ownerprofile;
import com.ruoyi.productmanage.mapper.ProductPrfileMapper;
import com.ruoyi.productmanage.domain.ProductPrfile;
import com.ruoyi.productmanage.service.IProductPrfileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 物资资料Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
@Service
public class ProductPrfileServiceImpl implements IProductPrfileService 
{
    @Autowired
    private ProductPrfileMapper productPrfileMapper;

    /**
     * 查询物资资料
     * 
     * @param pId 物资资料主键
     * @return 物资资料
     */
    @Override
    public ProductPrfile selectProductPrfileByPId(Long pId)
    {
        return productPrfileMapper.selectProductPrfileByPId(pId);
    }

    /**
     * 查询物资资料列表
     * 
     * @param productPrfile 物资资料
     * @return 物资资料
     */
    @Override
    public List<ProductPrfile> selectProductPrfileList(ProductPrfile productPrfile)
    {
        return productPrfileMapper.selectProductPrfileList(productPrfile);
    }

    /**
     * 新增物资资料
     * 
     * @param productPrfile 物资资料
     * @return 结果
     */
    @Transactional
    @Override
    public int insertProductPrfile(ProductPrfile productPrfile)
    {
        int rows = productPrfileMapper.insertProductPrfile(productPrfile);
        insertOwnerprofile(productPrfile);
        return rows;
    }

    /**
     * 修改物资资料
     * 
     * @param productPrfile 物资资料
     * @return 结果
     */
    @Transactional
    @Override
    public int updateProductPrfile(ProductPrfile productPrfile)
    {
        productPrfileMapper.deleteOwnerprofileByPId(productPrfile.getpId());
        insertOwnerprofile(productPrfile);
        return productPrfileMapper.updateProductPrfile(productPrfile);
    }

    /**
     * 批量删除物资资料
     * 
     * @param pIds 需要删除的物资资料主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteProductPrfileByPIds(String pIds)
    {
        productPrfileMapper.deleteProductPrfileByPIds(Convert.toStrArray(pIds));
        return productPrfileMapper.deleteProductPrfileByPIds(Convert.toStrArray(pIds));
    }

    /**
     * 删除物资资料信息
     * 
     * @param pId 物资资料主键
     * @return 结果
     */
    @Override
    public int deleteProductPrfileByPId(Long pId)
    {
        productPrfileMapper.deleteOwnerprofileByPId(pId);
        return productPrfileMapper.deleteProductPrfileByPId(pId);
    }

    /**
     * 新增捐赠人资料信息
     * 
     * @param productPrfile 物资资料对象
     */
    public void insertOwnerprofile(ProductPrfile productPrfile)
    {
        List<Ownerprofile> ownerprofileList = productPrfile.getOwnerprofileList();
        Long pId = productPrfile.getpId();
        if (StringUtils.isNotNull(ownerprofileList))
        {
            List<Ownerprofile> list = new ArrayList<Ownerprofile>();
            for (Ownerprofile ownerprofile : ownerprofileList)
            {
                ownerprofile.setpOwnerId(pId);
                list.add(ownerprofile);
            }
            if (list.size() > 0)
            {
                productPrfileMapper.batchOwnerprofile(list);
            }
        }
    }
}
