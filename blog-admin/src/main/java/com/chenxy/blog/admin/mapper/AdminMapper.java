package com.chenxy.blog.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenxy.blog.admin.pojo.Admin;
import com.chenxy.blog.admin.pojo.Permission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper extends BaseMapper<Admin> {
    @Select("select * from ms_permission where id in (select permission_id from ms_admin_permission where admin_id=#{id})")
    List<Permission> findPermissionsByAdminId(@Param("id") Long id);
}
