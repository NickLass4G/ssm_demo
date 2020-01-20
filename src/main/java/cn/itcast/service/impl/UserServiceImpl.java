package cn.itcast.service.impl;

import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:Administrator
 * @Date: 2020/1/20 21:52
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() throws Exception {
        return userMapper.findAll();
    }

    @Override
    public void save(User user) throws Exception {
        userMapper.save(user);
    }

    @Override
    public void delete(String id) throws Exception {
        userMapper.delete(id);
    }

    @Override
    public void update(User user) throws Exception {
        userMapper.update(user);
    }

    @Override
    public User findOne(String id) throws Exception {
        return userMapper.findOne(id);
    }
}
