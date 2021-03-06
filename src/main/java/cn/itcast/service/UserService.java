package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

/**
 * @Author:Administrator
 * @Date: 2020/1/20 21:51
 */
public interface UserService {
    List<User> findAll() throws Exception;

    void save(User user) throws Exception;

    void delete(String id) throws Exception;

    void update(User user) throws Exception;

    User findOne(String id) throws Exception;
}
