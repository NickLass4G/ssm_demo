package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:Administrator
 * @Date: 2020/1/20 21:53
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() throws Exception {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable("id") String id) throws Exception{
        return userService.findOne(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) throws Exception{
        userService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody User user) throws Exception{
        userService.update(user);
    }

    @PostMapping
    public void save(@RequestBody User user) throws Exception{
        userService.save(user);
    }

}
