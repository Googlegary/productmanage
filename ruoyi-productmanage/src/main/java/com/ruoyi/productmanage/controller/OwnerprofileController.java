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
import com.ruoyi.productmanage.domain.Ownerprofile;
import com.ruoyi.productmanage.service.IOwnerprofileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 捐赠人资料Controller
 * 
 * @author ruoyi
 * @date 2021-08-17
 */
@Controller
@RequestMapping("/productmanage/ownerprofile")
public class OwnerprofileController extends BaseController
{
    private String prefix = "productmanage/ownerprofile";

    @Autowired
    private IOwnerprofileService ownerprofileService;

    @RequiresPermissions("productmanage:ownerprofile:view")
    @GetMapping()
    public String ownerprofile()
    {
        return prefix + "/ownerprofile";
    }

    /**
     * 查询捐赠人资料列表
     */
    @RequiresPermissions("productmanage:ownerprofile:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Ownerprofile ownerprofile)
    {
        startPage();
        List<Ownerprofile> list = ownerprofileService.selectOwnerprofileList(ownerprofile);
        return getDataTable(list);
    }

    /**
     * 导出捐赠人资料列表
     */
    @RequiresPermissions("productmanage:ownerprofile:export")
    @Log(title = "捐赠人资料", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ownerprofile ownerprofile)
    {
        List<Ownerprofile> list = ownerprofileService.selectOwnerprofileList(ownerprofile);
        ExcelUtil<Ownerprofile> util = new ExcelUtil<Ownerprofile>(Ownerprofile.class);
        return util.exportExcel(list, "捐赠人资料数据");
    }

    /**
     * 新增捐赠人资料
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存捐赠人资料
     */
    @RequiresPermissions("productmanage:ownerprofile:add")
    @Log(title = "捐赠人资料", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Ownerprofile ownerprofile)
    {
        return toAjax(ownerprofileService.insertOwnerprofile(ownerprofile));
    }

    /**
     * 修改捐赠人资料
     */
    @GetMapping("/edit/{pOwnerId}")
    public String edit(@PathVariable("pOwnerId") Long pOwnerId, ModelMap mmap)
    {
        Ownerprofile ownerprofile = ownerprofileService.selectOwnerprofileByPOwnerId(pOwnerId);
        mmap.put("ownerprofile", ownerprofile);
        return prefix + "/edit";
    }

    /**
     * 修改保存捐赠人资料
     */
    @RequiresPermissions("productmanage:ownerprofile:edit")
    @Log(title = "捐赠人资料", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Ownerprofile ownerprofile)
    {
        return toAjax(ownerprofileService.updateOwnerprofile(ownerprofile));
    }

    /**
     * 删除捐赠人资料
     */
    @RequiresPermissions("productmanage:ownerprofile:remove")
    @Log(title = "捐赠人资料", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ownerprofileService.deleteOwnerprofileByPOwnerIds(ids));
    }
}
