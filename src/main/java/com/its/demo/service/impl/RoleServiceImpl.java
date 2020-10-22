package com.its.demo.service.impl;

import com.its.demo.dao.RoleMapper;
import com.its.demo.domain.*;
import com.its.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserVO getRoleVOByUsername(String rolename) {
        return null;
    }

    @Override
    public RoleVO getRoleVOByRolename(String rolename) {
        return null;
    }

    @Override
    public CurrentRoleDTO getCurrentRoleFromCache(String token) {
        return null;
    }


    @Override
    public void insertRole(RoleDO role) { roleMapper.insertRole(role);
    }

    @Override
    public void updateRole(RoleDO role) {
        roleMapper.updateRole(role);
    }


    @Override
    public void deleteRole(Long roleId) {
        roleMapper.deleteRole(roleId);
    }

    @Override
    public void saveRole(RoleDO role) {
        roleMapper.saverole(role);
    }

    @Override
    public RoleDO getRoleById(Long id) {
        return roleMapper.getroleById(id);
    }

    @Override
    public List<RoleDO> listAllRole() {
        return roleMapper.listAllRole();
    }

    @Override
    public List<RoleVO> listRoleVOs() {
        return roleMapper.listroleVOs();
    }

    @Override
    public void removeRole(Long id) {
    }

    @Override
    public void batchRemoveRole(String ids) {

    }

    @Override
    public Boolean isExistingRole(String role) {
        return null;
    }

    @Override
    public List<RoleDO> ListRolesByKeyword(String keyword) {
        return roleMapper.ListRolesByKeyword(keyword);
    }


}
