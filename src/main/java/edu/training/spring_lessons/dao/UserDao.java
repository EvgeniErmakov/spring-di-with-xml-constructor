package edu.training.spring_lessons.dao;

import edu.training.spring_lessons.bean.NewUserInfo;

public interface UserDao {
	
	String authorization(String login, String password) throws DAOException;
	boolean registration(NewUserInfo newUser) throws DAOException;

}
