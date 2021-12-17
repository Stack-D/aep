package com.itus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itus.model.entity.User;
import com.itus.service.UserService;
import com.itus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




