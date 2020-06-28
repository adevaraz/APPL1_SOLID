package _03_DetailPrinter;

import java.util.Iterator;
import java.util.List;

public class DetailsPrinter {
	private List<Employee> employee;
	
	public DetailsPrinter(List<Employee> employee) {
		this.employee = employee;
	}
	
	public void printDetails() {
		Iterator<Employee> empIter = employee.iterator();
		
		while(empIter.hasNext()) {
			Employee tmp = empIter.next();
			
			System.out.println(tmp);
		}
	}
}
