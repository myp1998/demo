package com.myp.test;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    @Test
    public void tes_01() throws IOException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("a.properties");
        properties.load(inputStream);
        inputStream.close();
    }
}
