package com.tools.service.user;

import com.tools.base.mybatis.IBasicSetMapper;
import com.tools.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * ProjectName: ssm-maven
 * CreateUser:  lixiaopeng
 * CreateTime : 2018/6/27 18:04
 * ModifyUser: bjlixiaopeng
 * Class Description:
 * To change this template use File | Settings | File and Code Template
 */


public interface IUserService extends IBasicSetMapper<User> {
    List<User> selectUsers();
}
