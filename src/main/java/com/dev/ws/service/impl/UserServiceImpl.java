package com.dev.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dev.ws.IDao.UserMapper;
import com.dev.ws.entity.User;
import com.dev.ws.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserMapper dao ;
	public List<User> queryForList() {
		return dao.getUsers();
	}

}
