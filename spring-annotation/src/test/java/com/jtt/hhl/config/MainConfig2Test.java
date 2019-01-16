package com.jtt.hhl.config;

import com.jtt.hhl.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Description: java类作用描述
 * @Author: Herman
 * @CreateDate: 2019/1/16 11:24
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainConfig2.class)
public class MainConfig2Test {

    @Autowired
    private Person person;

    @Test
    public void person() {
        assertNotNull(person);
        assertEquals("张三", person.getName());
    }

    @Test
    public void person01() {
    }

    @Test
    public void person02() {
    }

    @Test
    public void colorFactoryBean() {
    }
}