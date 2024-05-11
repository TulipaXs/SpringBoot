package com.example.springboot.mapper;

import com.example.springboot.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 增加
     * @param user
     */
    @Insert("insert into user(name,id,sex) " +"values(#{name},#{id},#{sex})")
    void insert(User user);

    /**
     * 删除
     * @param id
     */
    @Delete("delete from user where id = #{id} ")
    void delete(Integer id);

    /**
     * 修改
     * @param user
     */
    @Update("update user set name = #{name},id = #{id},sex = #{sex} where id =#{id} ")
    void update(User user);

    /**
     * 查询
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    User getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    @Select("select * from user")
    List<User> list();
}
