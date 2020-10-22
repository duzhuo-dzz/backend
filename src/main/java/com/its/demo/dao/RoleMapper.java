package com.its.demo.dao;

import com.its.demo.domain.RoleDO;
import com.its.demo.domain.RoleVO;
import com.its.demo.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 角色Mapper
 *
 * @author 杨金刚
 * @date 2020/8/9 13:36
 */
@Mapper
@Component(value = "roleMapper")
public interface RoleMapper {
    /**
     * 获取所有角色信息
     *
     * @return
     */
    RoleDO getRoleByRolename(String rolename);

    RoleVO getRoleVOByRolename(String username);

    List<RoleVO> listRoleinfos(String owner);

    List<RoleVO> listAllRoleinfos();

    List<RoleVO> listRoleinfoWhere(UserVO userInfo);

    List<RoleDO> listRoles();

    List<RoleDO> listAllRoles();

    void insertRole(RoleDO role);

    void updateRole(RoleDO role);

    void deleteRole(Long id);
    void saverole(RoleDO role);


    void deleteAll();


    Integer  disable(Long id);

    Integer  enable(Long id);

    // String checkPassword(String username);
     List<RoleDO> listAllRole();

    RoleDO getroleById(Long id);

    List<RoleVO> listroleVOs();

    List<RoleDO> ListRolesByKeyword(String keyword);
}
