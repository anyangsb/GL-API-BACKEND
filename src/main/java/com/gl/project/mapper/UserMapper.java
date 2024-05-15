package com.gl.project.mapper;

import com.gl.project.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 19328
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2024-05-14 11:39:48
* @Entity com.gl.project.model.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




