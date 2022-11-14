package com.lti.demo;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class CalculatorTest {
    Calculator c = new Calculator();
    @Test
    public void testsayHello() {
        Assertions.assertEquals("hello",c.sayHello());
        
    }
    @Test
    public void testAdd() {
        Assertions.assertEquals(100,c.add(60,40));
    }
    
    @Test
    public void testArrayList() {
		ArrayList<Integer> mylist=new ArrayList<Integer>();
		Assertions.assertEquals(0, mylist.size());
		mylist.add(100);
		mylist.add(120);
		Assertions.assertEquals(2, mylist.size());
	}
    
    
    
}
