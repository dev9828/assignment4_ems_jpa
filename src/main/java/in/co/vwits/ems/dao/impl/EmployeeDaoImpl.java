package in.co.vwits.ems.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.HTMLDocument.Iterator;

import in.co.vwits.ems.model.Employee;

public class EmployeeDaoImpl {
private List<Employee> employees;
	
	public EmployeeDaoImpl() {
		employees = new ArrayList<Employee>();
		Employee e1= new Employee();
		e1.setId(1);
		e1.setName("Devendra");
		e1.setSalary(5000);
		e1.setDepartment("Scania");
				
		Employee e2= new Employee();
		e2.setId(2);
		e2.setName("Amit");
		e2.setSalary(45678);
		e2.setDepartment("Skoda");
		
		Employee e3= new Employee();
		e3.setId(3);
		e3.setName("ShivendrA");
		e3.setSalary(67899);
		e3.setDepartment("BRANDS");

		Employee e4= new Employee();
		e3.setId(4);
		e3.setName("ARVIND");
		e3.setSalary(78900);
		e3.setDepartment("BRANDS");
		
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employee.add(e4);
		
	}
		public List<Employee> findAll(){
			return employees;
		}
		public void save(Employee s) {
			employees.add(s);
		}
		
		public Optional<Employee> findByEmpId(int empId) {
			for(Employee s:employees) {
				if(s.getId()==empId) {
					return Optional.of(s);				
				}
			}
			return Optional.empty();
			
			
		}
		 public void updateByRollno(int empId, double modifiedSalary)
		 { for(Employee s:employees) {
			 if(s.getId()==empId) { s.setSalary(modifiedSalary); } }
		 }
			
}
