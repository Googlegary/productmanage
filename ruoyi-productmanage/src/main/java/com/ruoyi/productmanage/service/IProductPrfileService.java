package com.ruoyi.productmanage.service;

import java.util.List;
import com.ruoyi.productmanage.domain.ProductPrfile;

/**
 * 物资资料Service接口
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
public interface IProductPrfileService 
{
    /**
     * 查询物资资料
     * 
     * @param pId 物资资料主键
     * @return 物资资料
     */
    public ProductPrfile selectProductPrfileByPId(Long pId);

    /**
     * 查询物资资料列表
     * 
     * @param productPrfile 物资资料
     * @return 物资资料集合
     */
    public List<ProductPrfile> selectProductPrfileList(ProductPrfile productPrfile);

    /**
     * 新增物资资料
     * 
     * @param productPrfile 物资资料
     * @return 结果
     */
    public int insertProductPrfile(ProductPrfile productPrfile);

    /**
     * 修改物资资料
     * 
     * @param productPrfile 物资资料
     * @return 结果
     */
    public int updateProductPrfile(ProductPrfile productPrfile);

    /**
     * 批量删除物资资料
     * 
     * @param pIds 需要删除的物资资料主键集合
     * @return 结果
     */
    public int deleteProductPrfileByPIds(String pIds);

    /**
     * 删除物资资料信息
     * 
     * @param pId 物资资料主键
     * @return 结果
     */
    public int deleteProductPrfileByPId(Long pId);
}
