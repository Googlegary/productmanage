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
import com.ruoyi.productmanage.domain.ProductPrfile;
import com.ruoyi.productmanage.service.IProductPrfileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物资资料Controller
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
@Controller
@RequestMapping("/productmanage/prfile")
public class ProductPrfileController extends BaseController
{
    private String prefix = "productmanage/prfile";

    @Autowired
    private IProductPrfileService productPrfileService;

    @RequiresPermissions("productmanage:prfile:view")
    @GetMapping()
    public String prfile()
    {
        return prefix + "/prfile";
    }

    /**
     * 查询物资资料列表
     */
    @RequiresPermissions("productmanage:prfile:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProductPrfile productPrfile)
    {
        startPage();
        List<ProductPrfile> list = productPrfileService.selectProductPrfileList(productPrfile);
        return getDataTable(list);
    }

    /**
     * 导出物资资料列表
     */
    @RequiresPermissions("productmanage:prfile:export")
    @Log(title = "物资资料", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProductPrfile productPrfile)
    {
        List<ProductPrfile> list = productPrfileService.selectProductPrfileList(productPrfile);
        ExcelUtil<ProductPrfile> util = new ExcelUtil<ProductPrfile>(ProductPrfile.class);
        return util.exportExcel(list, "物资资料数据");
    }

    /**
     * 新增物资资料
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存物资资料
     */
    @RequiresPermissions("productmanage:prfile:add")
    @Log(title = "物资资料", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ProductPrfile productPrfile)
    {
        return toAjax(productPrfileService.insertProductPrfile(productPrfile));
    }

    /**
     * 修改物资资料
     */
    @GetMapping("/edit/{pId}")
    public String edit(@PathVariable("pId") Long pId, ModelMap mmap)
    {
        ProductPrfile productPrfile = productPrfileService.selectProductPrfileByPId(pId);
        mmap.put("productPrfile", productPrfile);
        return prefix + "/edit";
    }

    /**
     * 修改保存物资资料
     */
    @RequiresPermissions("productmanage:prfile:edit")
    @Log(title = "物资资料", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProductPrfile productPrfile)
    {
        return toAjax(productPrfileService.updateProductPrfile(productPrfile));
    }

    /**
     * 删除物资资料
     */
    @RequiresPermissions("productmanage:prfile:remove")
    @Log(title = "物资资料", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(productPrfileService.deleteProductPrfileByPIds(ids));
    }
}
