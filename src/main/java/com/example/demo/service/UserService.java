package com.example.demo.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.entity.UserEntity;
import com.example.demo.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 16:14:33
 */
public interface UserService extends IService<UserEntity> {
  int updateUsername(int id ,String username);
}

