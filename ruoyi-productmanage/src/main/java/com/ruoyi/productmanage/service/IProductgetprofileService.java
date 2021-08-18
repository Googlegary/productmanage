package com.ruoyi.productmanage.service;

import java.util.List;
import com.ruoyi.productmanage.domain.Productgetprofile;

/**
 * 受赠人资料Service接口
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
public interface IProductgetprofileService 
{
    /**
     * 查询受赠人资料
     * 
     * @param pGetId 受赠人资料主键
     * @return 受赠人资料
     */
    public Productgetprofile selectProductgetprofileByPGetId(Long pGetId);

    /**
     * 查询受赠人资料列表
     * 
     * @param productgetprofile 受赠人资料
     * @return 受赠人资料集合
     */
    public List<Productgetprofile> selectProductgetprofileList(Productgetprofile productgetprofile);

    /**
     * 新增受赠人资料
     * 
     * @param productgetprofile 受赠人资料
     * @return 结果
     */
    public int insertProductgetprofile(Productgetprofile productgetprofile);

    /**
     * 修改受赠人资料
     * 
     * @param productgetprofile 受赠人资料
     * @return 结果
     */
    public int updateProductgetprofile(Productgetprofile productgetprofile);

    /**
     * 批量删除受赠人资料
     * 
     * @param pGetIds 需要删除的受赠人资料主键集合
     * @return 结果
     */
    public int deleteProductgetprofileByPGetIds(String pGetIds);

    /**
     * 删除受赠人资料信息
     * 
     * @param pGetId 受赠人资料主键
     * @return 结果
     */
    public int deleteProductgetprofileByPGetId(Long pGetId);
}
