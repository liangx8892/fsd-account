package com.fsd.sba.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.sba.entity.User;
import com.fsd.sba.exception.BusinessException;
import com.fsd.sba.mapper.UserMapper;
import com.fsd.sba.model.UserModel;

@Service
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
    @Autowired
    private UserMapper userMapper;
	
	public void addUser(User user) {
		logger.debug("User {} to be added.", user);
		User userInDB = userMapper.findByName(user.getEmail());
		logger.debug("User {} returned from db.", userInDB);
		if(userInDB != null) {
            throw new BusinessException(String.format("User name %s already exists.", 
            		user.getEmail()));
		}
		userMapper.save(user);
	}
	
	public User findUser(String userName) {
		User user = userMapper.findByName(userName);
		logger.debug("User {} returned from db.", user);
		return user;
	}

	public List<UserModel> getUsersByIds(List<Long> userIds){
		List<User> users =  userMapper.getUsersByIds(userIds);
		List<UserModel> list = new ArrayList<>();
		users.stream().forEach( user -> list.add(new UserModel(user)));
		logger.debug("Users returned from db: {}", list);
		return list;
	}
}
