package com.company.hr;

public class Employee {
	private int id;
	private String name;
	private  double salary;
	public int setid (int id) {
	this.id = id;
}
public String setname( String name ) {
this.name=name;
}
public double setsalary(double salary) {
this.salary=salary;
}
public int getid() {
 return id;
}
public String getname() {
	return name;
	
}
public double getsalary() {
	return salary;
}
  public void showEmployeeDetails() {
	  System.out.println("employee name:"+name);
	  System.out.println("id:"+id);
	  System.out.println("salary:"+salary);
  }
}
package com.company.admin;

public class Department {
	private String departmentname;
	private int deptid;
	public String setdeptname (String departmentname){
		this.departmentname=departmentname ;
		public int setdeptid( int deptid) {
			this.deptid=deptid;
		}
		public String getdeptname() {
		return departmentname;
		}
		public int getdeptid() {
			return  deptid;
			
		}
		public String showDepartmentDetails() {
			System.out.println("department:"+departmentname);
             System.out.println(" dept id:"+deptid);
					
		}		
		}
package com.company.admin;
import com.company.hr.Employee;
import com.company.admin.Department;
public class CompanyApp {
	public static void main(String[] args) {
		Employee f2=new Employee();
		f2.setid(12);
		f2.setname("gopi");
		f2.setsalary(1200);
		Department A2=new Department();
		A2.setdeptid(90);
		Department h21=new Department();
		A2.setdeptname("cse");
		System.out.println();
		f2.showEmployeeDetails();
		A2.showDepartmentDetails();

		
		
		
		
		
	}
	
	
	

}

		
		
	

 





	
}	