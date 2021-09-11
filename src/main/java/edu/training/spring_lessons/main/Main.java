package edu.training.spring_lessons.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.training.spring_lessons.dao.UserDao;
import edu.training.spring_lessons.dao.cp.ConnectionPool;

public class Main {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = null;
		UserDao userDao = null;

		try {
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			userDao = context.getBean("userDAO", UserDao.class);
			userDao.authorization("qwerty", "123456");
		} catch (Exception e) {
			// to do smth
		} finally {
			if (context != null) {
				context.close();
			}
		}

	}

}
