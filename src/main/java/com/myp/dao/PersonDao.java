package com.myp.dao;

import com.myp.entity.Person;

public interface PersonDao {
    /**
     * 根据id查询
     */
    Person queryPersonById(Integer id);

}
