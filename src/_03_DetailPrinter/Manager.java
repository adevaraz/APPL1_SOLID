package _03_DetailPrinter;

import java.util.List;
import java.util.ArrayList;

public class Manager extends Employee {
	private List<String> documents;
	
	public Manager(String name, List<String> documents) {
		super(name);
		this.documents = new ArrayList<String>(documents);
	}
	
	public void writeDocument(List<String> documents) {
		this.documents = (ArrayList<String>) documents;
	}
	
	public List<String> readDocument() {
		return this.readDocument();
	}
	
	public String toString() {
		return super.toString() + "===\n" + this.documents + "\n";
	}
}
