package com.example.patterns.proxy.staticproxy;

/**
 * @author dongjingxi
 * @date 2023/3/13
 */
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("新增一个用户");
    }

    @Override
    public void updateUser(String username) {
        System.out.println("更新用户：" + username + " 信息");
    }

    @Override
    public void deleteUser(String username) {
        System.out.println("删除用户：" + username);
    }

}
