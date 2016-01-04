package com.zhy.Model.User;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource ="config.xml";
		InputStream isInputStream = MainClass.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(isInputStream);
		SqlSession session = sessionFactory.openSession();
//		String statementString = "com.zhy.Mapping.mapper.userMapper.getUser";
//		User user = session.selectOne(statementString);
//		System.out.println(user);
		String nameString = "com.zhy.Mapping.mapper.userMapper.setName";
		Name name = session.selectOne(nameString);
		System.out.println(name.toString());
	}

}
