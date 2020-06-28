package _03_DetailPrinter;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("John");
		Manager manager = (Manager) new Employee("Doe");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(emp);
		list.add(manager);
		
		DetailsPrinter printer = new DetailsPrinter(list);
		printer.printDetails();
		
	}
}
