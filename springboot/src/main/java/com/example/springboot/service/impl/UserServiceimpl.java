package com.example.springboot.service.impl;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现类
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 增加
     * @param user
     */
    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    /**
     * 修改
     * @param user
     */
    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    /**
     * 查询1
     * @param id
     * @return
     */
    @Override
    public User getById(Integer id) {
        if(userMapper.getById(id) == null)
            return null;
        else
            return userMapper.getById(id);

    }
    /**
     * 查询所有
     * @return
     */
    public List<User> list() {
        return userMapper.list();
    }
}
