package com.example.patterns.proxy.staticproxy;

import com.example.patterns.proxy.TransactionalImpl;

/**
 * @author dongjingxi
 * @date 2023/3/13
 */
public class UserServiceTransactionImpl implements UserService {


    private final UserServiceImpl userServiceImpl;

    private final TransactionalImpl transactional = new TransactionalImpl();


    public UserServiceTransactionImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public void addUser() {

        transactional.open();
        try {
            userServiceImpl.addUser();
            transactional.commit();
        } catch (Exception e) {
            transactional.rollback();
        }

    }

    @Override
    public void updateUser(String username) {
        transactional.open();
        try {
            userServiceImpl.updateUser(username);
            transactional.commit();
        } catch (Exception e) {
            transactional.rollback();
        }
    }

    @Override
    public void deleteUser(String username) {
        transactional.open();
        try {
            userServiceImpl.deleteUser(username);
            transactional.commit();
        } catch (Exception e) {
            transactional.rollback();
        }

    }

}
