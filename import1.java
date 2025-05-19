package com.school.management;
public class School {
	private String name;
	private String location;
	 public void  setName( String setname) {
      this.name=name;
       }
	 public void setlocation(String setlocation) {
		 this.location=location;
	 }
	 public  String getname() {
	 return name;
	 }
	 
    public String getlocation() {
	 return location;
}
  public void showSchoolInfo() {
  System.out.println(" school name="+name);
  System.out.println(" schoollocation="+location);
  }
}
package com.school.management;
public class School {
	private String name;
	private String location;
	 public void  setName( String setname) {
      this.name=name;
       }
	 public void setlocation(String setlocation) {
		 this.location=location;
	 }
	 public  String getname() {
	 return name;
	 }
	 
    public String getlocation() {
	 return location;
}
  public void showSchoolInfo() {
  System.out.println(" school name="+name);
  System.out.println(" schoollocation="+location);
  }
}
package com.school.app;
import com.school.management.School;
 import com.school.staff.Principal;

public class Schoolapp {
	public static void main(String[] args) {
		School f2=new School();
		f2.setname( "teja talentschool");
		f2.setlocation("hyderabad");
		
		Principal h2=new Principal();
		h2.setname=("gopi");
		  h2.setexperience(12);
		  
		  System.out.println();
		  f2 . showSchoolInfo();
		   h2. showPrincipalInfo();
		  
		 
	}  
		
		
	}
	
	


