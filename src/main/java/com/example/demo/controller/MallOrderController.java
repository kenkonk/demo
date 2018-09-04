package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.entity.MallOrderEntity;
import com.example.demo.entity.SysUserEntity;
import com.example.demo.service.MallOrderService;
import com.example.demo.service.SysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-08-30 19:30:20
 */
@RestController
@RequestMapping("generator/mallorder")
public class MallOrderController {
    @Autowired
    private MallOrderService mallOrderService;
    @Autowired
    private SysUserService sysUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:mallorder:list")
    @ResponseBody
    public String list(@RequestParam Map<String, Object> params){
        SysUserEntity sysUserEntity = sysUserService.getByUsername("leo");
//        MallOrderEntity entity = mallOrderService.selectById(7);
//        List<Long> list = new ArrayList<>();
//        list.add(7l);
//        list.add(8l);
//        list.add(1l);
//        List<MallOrderEntity> mallOrderEntities = (List<MallOrderEntity>) mallOrderService.selectBatchIds(list);
       System.out.println(sysUserEntity.toString());
        return "ok";
    }

//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:mallorder:info")
//    public R info(@PathVariable("id") Integer id){
//			MallOrderEntity mallOrder = mallOrderService.selectById(id);
//
//        return R.ok().put("mallOrder", mallOrder);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:mallorder:save")
//    public R save(@RequestBody MallOrderEntity mallOrder){
//			mallOrderService.insert(mallOrder);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:mallorder:update")
//    public R update(@RequestBody MallOrderEntity mallOrder){
//			mallOrderService.updateById(mallOrder);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:mallorder:delete")
//    public R delete(@RequestBody Integer[] ids){
//			mallOrderService.deleteBatchIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
