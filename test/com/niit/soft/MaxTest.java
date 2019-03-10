package com.niit.soft;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans01.xml"})
public class MaxTest{
    @Autowired
    private Max max;
    @Test
    public void getMax() throws Exception{
        int result=max.getMax();
        System.out.println(result);
        assertEquals(result,12);
    }
}