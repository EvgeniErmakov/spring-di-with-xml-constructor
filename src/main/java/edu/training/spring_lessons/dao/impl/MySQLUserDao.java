package edu.training.spring_lessons.dao.impl;

import edu.training.spring_lessons.bean.NewUserInfo;
import edu.training.spring_lessons.dao.DAOException;
import edu.training.spring_lessons.dao.UserDao;
import edu.training.spring_lessons.dao.cp.ConnectionPool;

public class MySQLUserDao implements UserDao {
	
	private ConnectionPool connectionPool;
	
	public MySQLUserDao(ConnectionPool connectionPool) {
		this.connectionPool = connectionPool;
	}
	

	public void setConnectionPool(ConnectionPool connectionPool) {
		this.connectionPool = connectionPool;
	}

	@Override
	public String authorization(String login, String password) throws DAOException {
		// stub
		try {
			connectionPool.take();
		} catch (Exception e) {
			throw new DAOException(e);
		}
		return null;
	}

	@Override
	public boolean registration(NewUserInfo newUser) throws DAOException {
		// stub
		return false;
	}

}
