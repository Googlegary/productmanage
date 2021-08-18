package com.ruoyi.productmanage.mapper;

import java.util.List;
import com.ruoyi.productmanage.domain.ProductPrfile;
import com.ruoyi.productmanage.domain.Ownerprofile;

/**
 * 物资资料Mapper接口
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
public interface ProductPrfileMapper 
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
     * 删除物资资料
     * 
     * @param pId 物资资料主键
     * @return 结果
     */
    public int deleteProductPrfileByPId(Long pId);

    /**
     * 批量删除物资资料
     * 
     * @param pIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProductPrfileByPIds(String[] pIds);

    /**
     * 批量删除捐赠人资料
     * 
     * @param pIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOwnerprofileByPIds(String[] pIds);
    
    /**
     * 批量新增捐赠人资料
     * 
     * @param ownerprofileList 捐赠人资料列表
     * @return 结果
     */
    public int batchOwnerprofile(List<Ownerprofile> ownerprofileList);
    

    /**
     * 通过物资资料主键删除捐赠人资料信息
     * 
     * @param pId 物资资料ID
     * @return 结果
     */
    public int deleteOwnerprofileByPId(Long pId);
}
