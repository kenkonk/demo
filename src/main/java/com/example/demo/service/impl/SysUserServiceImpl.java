package com.example.demo.service.impl;

import com.example.demo.entity.SysUserEntity;
import com.example.demo.mapper.SysUserDao;
import com.example.demo.service.SysUserService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;



@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {



}
