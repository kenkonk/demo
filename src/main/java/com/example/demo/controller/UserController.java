package com.example.demo.controller;

import java.util.Arrays;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import com.example.demo.utils.PageUtils;
import com.example.demo.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 16:14:33
 */
@RestController
@RequestMapping("kenkon/user")
public class UserController {
    @Autowired
    private UserService userService;




    /**
     * 信息
     */
    @RequestMapping("/getById")
    @ResponseBody
    public R getByName(int id){
			UserEntity user = userService.selectById(id);

        return R.ok().put("user", user);
    }
    /**
     * 信息
     */
    @RequestMapping("/getByName")
    @ResponseBody
    public R getByName(String name){
        UserEntity user = userService.selectOne(new EntityWrapper<UserEntity>().eq("username",name));
        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @RequestMapping("/insert")
    public R insert(String username ,String password){
        UserEntity user = new UserEntity();
                user.setUsername(username);
                user.setPassword(password);
		userService.insert(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(int id , String username){
//        UserEntity user = new UserEntity();
//        user.setId(1);
//        user.setUsername(username);

			userService.updateUsername(id,username);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
			userService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
