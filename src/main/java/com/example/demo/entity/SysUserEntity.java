package com.example.demo.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 18:04:52
 */
@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer oid;
	/**
	 * 
	 */
	private String username;
	/**
	 * 
	 */
	private String password;
	/**
	 * 
	 */
	private String salt;
	/**
	 * 
	 */
	private Integer userType;
	/**
	 * 
	 */
	private Instant lastloginDate;
	/**
	 * 
	 */
	private Instant createdDate;
	/**
	 * 
	 */
	private Instant updatedDate;

	@TableField(exist = false)
	private List<String> rolenamelist;
	@TableField(exist = false)
	private List<String> permissionnamelist;
}
