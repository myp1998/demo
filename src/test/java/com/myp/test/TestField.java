package com.myp.test;

import com.myp.entity.Person;
import org.junit.Test;

import java.lang.reflect.Field;

public class TestField {

    @Test
    public void reflect() throws NoSuchFieldException, SecurityException {
        Person person = new Person();
        Class<?> c = person.getClass();
        System.out.println("它的名字是(getClass)：" + c.getName());

        System.out.println("----------------------");

        //获得公有属性
        Field[] fields = c.getFields();
        for (Field ff : fields) {
            System.out.println("它的公有属性(getFields)：" + ff.getName());
        }

        System.out.println("----------------------");

        //获得所有属性
        Field[] fs2 = c.getDeclaredFields();
        for (Field ff : fs2) {
            System.out.println("它的所有属性(getDeclaredFields)：" + ff.getName());
        }

        System.out.println("----------------------");

        //获得指定属性
        //Field fs3 = c.getField("name");
        //System.out.println("它的属性(getField(\"name\"))：" + fs3);

        //获得指定名字的所有属性
        System.out.println("----------------------");
        Field fs4 = c.getDeclaredField("name");
        System.out.println("它的属性：" + fs4.getName());
    }

}

