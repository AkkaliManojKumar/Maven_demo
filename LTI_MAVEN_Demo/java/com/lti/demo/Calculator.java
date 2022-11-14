package com.lti.demo;

public class Calculator {
	
    
   

	public int add(int x, int y) {
		// TODO Auto-generated method stub
		int result = x+y;
        return result;
	}
	



	public Object sayHello() {
		// TODO Auto-generated method stub
		return "hello";
		
	}
	
	
	public void searchEmpId(int empid)
    {
        if(empid==0)
        {
            throw new ArithmeticException("u enetered zero");
        }
        else
        {
            System.out.println(" do something");
            
            
            
        }
        
    }

	
	
}
