package ex3_2;

public class EmployeeController extends Employee{
	Employee e = new Employee();
	
	public void add(int empNo,String name,char gender, String pone) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(pone);
	}
	public void add(int empNo,String name,char gender, String pone, String dept ,int salary,double bonus) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(pone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);
	}
	public void modify(String phone) {
		e.setPhone(phone);
	}
	public void modify(int salary) {
		e.setSalary(salary);
	}
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	public Employee remove() {
		return e=null;
	}
	public String inform() {
		if(e==null) { return null;}
		else {return e.printEmployee();}
			
		}
	}



