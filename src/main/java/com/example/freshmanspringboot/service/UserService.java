/**
 * 機能：
 * 作成者：kaise
 * 期日：2023/11/28 15:24
 */

package com.example.freshmanspringboot.service;

import com.example.freshmanspringboot.entity.User;
import com.example.freshmanspringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void inserUser(User user) {
        userMapper.insert(user);
    }

    public void updateUser(User user) {
        userMapper.update(user);
    }

    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    public void batchDeleteUser(List<Integer> ids) {
        for (Integer id : ids) {
            userMapper.deleteUser(id);
        }

    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    //验证用户账号是否合法
    public User login(User user) {
        //根据用户名查询数据库的用户信息
        User dbUser = userMapper.selectByUsername(user.getUsername());
        if (dbUser == null){
            //抛出一个自定义的异常
            throw new SecurityException("ユーザー名またはパスワードが間違っている");
        }
        if (!Objects.equals(user.getPassword(), dbUser.getPassword())){
            throw new SecurityException("ユーザー名またはパスワードが間違っている");
        }
        return dbUser;
    }
}
