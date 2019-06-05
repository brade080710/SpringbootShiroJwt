package com.wang.mapper;

import com.wang.model.UserDto;
import com.wang.model.UserPermission;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * UserMapper
 * @author Wang926454
 * @date 2018/8/31 14:43
 */
public interface UserMapper extends Mapper<UserDto> {
    /**
     * 根据Role查询Permission
     * @param userDto
     */
    List<UserPermission> findInfoByUser(UserDto userDto);
}