package com.example.springboot.service;

import com.example.springboot.pojo.User;

import java.util.List;

/**
 * 接口定义
 */
public interface UserService {

    /**
     * 增加
     * @param user
     */
     void save(User user);
    /**
     * 删除
     * @param id
     */
    void delete(Integer id);
    /**
     * 修改
     * @param user
     */
    void update(User user);

    /**
     * 查询1
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<User> list();
}
