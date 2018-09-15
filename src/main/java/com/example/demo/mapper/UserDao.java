package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 16:14:33
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	int updateUsername(int id , String username);
}
