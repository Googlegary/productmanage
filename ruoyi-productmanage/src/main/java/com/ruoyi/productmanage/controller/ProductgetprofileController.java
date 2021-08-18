package com.ruoyi.productmanage.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.productmanage.domain.Productgetprofile;
import com.ruoyi.productmanage.service.IProductgetprofileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 受赠人资料Controller
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
@Controller
@RequestMapping("/productmanage/productgetprofile")
public class ProductgetprofileController extends BaseController
{
    private String prefix = "productmanage/productgetprofile";

    @Autowired
    private IProductgetprofileService productgetprofileService;

    @RequiresPermissions("productmanage:productgetprofile:view")
    @GetMapping()
    public String productgetprofile()
    {
        return prefix + "/productgetprofile";
    }

    /**
     * 查询受赠人资料列表
     */
    @RequiresPermissions("productmanage:productgetprofile:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Productgetprofile productgetprofile)
    {
        startPage();
        List<Productgetprofile> list = productgetprofileService.selectProductgetprofileList(productgetprofile);
        return getDataTable(list);
    }

    /**
     * 导出受赠人资料列表
     */
    @RequiresPermissions("productmanage:productgetprofile:export")
    @Log(title = "受赠人资料", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Productgetprofile productgetprofile)
    {
        List<Productgetprofile> list = productgetprofileService.selectProductgetprofileList(productgetprofile);
        ExcelUtil<Productgetprofile> util = new ExcelUtil<Productgetprofile>(Productgetprofile.class);
        return util.exportExcel(list, "受赠人资料数据");
    }

    /**
     * 新增受赠人资料
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存受赠人资料
     */
    @RequiresPermissions("productmanage:productgetprofile:add")
    @Log(title = "受赠人资料", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Productgetprofile productgetprofile)
    {
        return toAjax(productgetprofileService.insertProductgetprofile(productgetprofile));
    }

    /**
     * 修改受赠人资料
     */
    @GetMapping("/edit/{pGetId}")
    public String edit(@PathVariable("pGetId") Long pGetId, ModelMap mmap)
    {
        Productgetprofile productgetprofile = productgetprofileService.selectProductgetprofileByPGetId(pGetId);
        mmap.put("productgetprofile", productgetprofile);
        return prefix + "/edit";
    }

    /**
     * 修改保存受赠人资料
     */
    @RequiresPermissions("productmanage:productgetprofile:edit")
    @Log(title = "受赠人资料", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Productgetprofile productgetprofile)
    {
        return toAjax(productgetprofileService.updateProductgetprofile(productgetprofile));
    }

    /**
     * 删除受赠人资料
     */
    @RequiresPermissions("productmanage:productgetprofile:remove")
    @Log(title = "受赠人资料", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(productgetprofileService.deleteProductgetprofileByPGetIds(ids));
    }
}
