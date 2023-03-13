package com.example.patterns.proxy.staticproxy;

/**
 * @author dongjingxi
 * @date 2023/3/14
 */
public class Test {


    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceTransactionImpl userServiceTransaction = new UserServiceTransactionImpl(userService);

        userServiceTransaction.addUser();
        userServiceTransaction.updateUser("user1");
        userServiceTransaction.deleteUser("user1");
    }

}
