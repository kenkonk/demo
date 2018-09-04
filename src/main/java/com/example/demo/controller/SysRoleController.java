package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.example.demo.entity.SysRoleEntity;
import com.example.demo.entity.SysUserEntity;
import com.example.demo.mapper.SysRoleDao;
import com.example.demo.service.SysRoleService;
import com.example.demo.service.SysUserService;
import com.example.demo.utils.PageUtils;
import com.example.demo.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 18:04:52
 */
@RestController
@RequestMapping("generator/sysrole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleDao sysRoleDao;
    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:sysrole:list")
    public R list(@RequestParam Map<String, Object> params){
        SysUserEntity sysUserEntity = sysUserService.testget("leo");
        return R.ok().put("page", sysUserEntity);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{oid}")
    @RequiresPermissions("generator:sysrole:info")
    public R info(@PathVariable("oid") Long oid){
			SysRoleEntity sysRole = sysRoleService.selectById(oid);

        return R.ok().put("sysRole", sysRole);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:sysrole:save")
    public R save(@RequestBody SysRoleEntity sysRole){
			sysRoleService.insert(sysRole);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:sysrole:update")
    public R update(@RequestBody SysRoleEntity sysRole){
			sysRoleService.updateById(sysRole);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:sysrole:delete")
    public R delete(@RequestBody Long[] oids){
			sysRoleService.deleteBatchIds(Arrays.asList(oids));

        return R.ok();
    }

}
