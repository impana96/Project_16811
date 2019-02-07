package Emp;
import java.util.*;
public class UserEmployee {
	public static void main(String args[]) {
		Employee e=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e.setEmpid(101);
		e2.setEmpid(102);
		e3.setEmpid(103);
		e.setEmpname("Impana");
		e2.setEmpname("Rachna");
		e3.setEmpname("Harshad");
		e.setEmpsal(10000);
		e2.setEmpsal(12000);
		e3.setEmpsal(14000);
		
		EmployeeImpl e1=new EmployeeImpl();
		e1.addEmployee(e);
		e1.addEmployee(e2);;
		e1.addEmployee(e3);
		e1.deleteEmployee(e);	
		
		e1.readEmployee();
		
		
	
	}

}
