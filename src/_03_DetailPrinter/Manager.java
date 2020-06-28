package _03_DetailPrinter;

import java.util.List;
import java.util.Collection;

public class Manager extends Employee {
	private Collection<String> documents;
	
	public Manager(String name, List<String> documents) {
		super(name);
		this.documents = documents;
	}
	
	public void writeDocument(List<String> documents) {
		this.documents = documents;
	}
	
	public List<String> readDocument() {
		return this.readDocument();
	}
	
	public String toString() {
		return super.toString() + "\n===\n" + this.documents;
	}
}
