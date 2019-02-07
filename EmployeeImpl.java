package Emp;

import java.util.*;

public class EmployeeImpl implements EmployeeInt{

	LinkedList<Employee> e1=new LinkedList<Employee>();
	
	public void addEmployee(Employee e) 
	{				
		e1.add(e);	
		System.out.println(e);
		
	}

	
	public void deleteEmployee(Employee e) 
	{		
		e1.remove(e);	
		//System.out.println(e);
		
	}
	
	public Object readEmployee() {
		
		Iterator itr= e1.iterator();
		while(itr.hasNext()) {
			//Employee em=(Employee)itr.next();
			System.out.println(itr.next());
		}
		return e1;
	}
	
	

}
