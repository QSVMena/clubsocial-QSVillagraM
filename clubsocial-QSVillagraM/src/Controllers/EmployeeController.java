package Controllers;
import java.util.ArrayList;
import java.util.List;

import Modells.Employee;

public class EmployeeController implements IGestion<Employee> {
	
	private ArrayList<Employee> listEmployee;
	
	public EmployeeController() {
		listEmployee = new ArrayList();
	}

	@Override
	public void Add(Employee Obj) {
		listEmployee.add(Obj);
	}

	@Override
	public ArrayList<Employee> GetList() {
		return listEmployee;
	}

}
