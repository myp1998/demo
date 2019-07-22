package com.myp.dao;

import com.myp.entity.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;

public class PersonDaoTest {
    @Test
    public void test() throws Exception {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = builder.build(reader);
        SqlSession session = factory.openSession();
        PersonDao personDao = session.getMapper(PersonDao.class);
        Person person = personDao.queryPersonById(1);
        System.out.println(person);
        session.close();
    }


}