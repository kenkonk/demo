package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 18:04:52
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
	SysUserEntity testget(String username);
}
