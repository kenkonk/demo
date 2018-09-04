package com.example.demo.service.impl;

import com.example.demo.entity.SysUserEntity;
import com.example.demo.mapper.SysPermissionDao;
import com.example.demo.mapper.SysRoleDao;
import com.example.demo.mapper.SysUserDao;
import com.example.demo.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;


@Slf4j
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

    @Autowired
    private SysRoleDao sysRoleDao;
    @Autowired
    private SysUserDao sysUserDao;
    @Autowired
    private SysPermissionDao sysPermissionDao;

    public SysUserEntity getByUsername(String username ){
        try{
            SysUserEntity sysUser =  this.selectOne(new EntityWrapper<SysUserEntity>().eq("username",username));
            if (null==sysUser){
                return null;
            }
            if (!sysRoleDao.getRoleNameByUserId(sysUser.getOid()).isEmpty()) {
                List<String> roleNameList = sysRoleDao.getRoleNameByUserId(sysUser.getOid());
                sysUser.setRolenamelist(roleNameList);
            }
            if (!sysPermissionDao.getPermissionNameByUserId(sysUser.getOid()).isEmpty()){
                List<String> permissionNameList = sysPermissionDao.getPermissionNameByUserId(sysUser.getOid());
                sysUser.setPermissionnamelist(permissionNameList);
            }
            return sysUser;
        }
        catch(Exception e){
            log.error("UserService.getById",e);
            return null;
        }
    }

    @Override
    public SysUserEntity testget(String username) {
        return sysUserDao.testget(username);
    }


}
