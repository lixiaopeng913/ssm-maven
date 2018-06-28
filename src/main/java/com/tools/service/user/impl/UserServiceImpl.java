package com.tools.service.user.impl;

import com.tools.base.mybatis.impl.BasicSetServiceImpl;
import com.tools.dao.user.mapper.UserMapper;
import com.tools.domain.User;
import com.tools.service.user.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * ProjectName: ssm-maven
 * CreateUser:  lixiaopeng
 * CreateTime : 2018/6/27 18:05
 * ModifyUser: bjlixiaopeng
 * Class Description:
 * To change this template use File | Settings | File and Code Template
 */

@Service
public class UserServiceImpl extends BasicSetServiceImpl<User> implements IUserService {

    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectUsers() {
        return userMapper.select(null);
    }
}
