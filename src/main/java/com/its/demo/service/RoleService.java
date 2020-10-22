package com.its.demo.service;

import com.its.demo.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 杨金刚
 * @date 2020/4/22 13:32
 */
@Service
public interface RoleService {
    /**
     *
     * @return
     */
    UserVO getRoleVOByUsername(String rolename);

    RoleVO getRoleVOByRolename(String rolename);

    CurrentRoleDTO getCurrentRoleFromCache(String token);


    void insertRole(RoleDO role);
    void updateRole(RoleDO role);
    void deleteRole(Long roleId);
    void saveRole(RoleDO role);

    RoleDO getRoleById(Long id);

    List<RoleDO> listAllRole();

    List<RoleVO> listRoleVOs();

    void removeRole(Long id);

    void batchRemoveRole(String ids);

    Boolean isExistingRole(String role);


    List<RoleDO> ListRolesByKeyword(String keyword);

}
