package employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Employee {

	private String name;
	private String position;
	private String salary;
	private int employeeID;
	private static int index = 2200;

	public Employee(String name, String position, String salary) {

		this.name = name;
		this.position = position;
		this.salary = salary;
		employeeID = index++;

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + ", employeeID=" + employeeID
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public void showInfo() {
		System.out.println("Employee Name: " + name + "\n Position: " + position + "\n Salary: " + salary
				+ "\n Employee ID: " + employeeID);
	}
	
	
	public void writeOut(String filename) throws DocumentException {

		
		try {
			
			Document document = new Document();
			
			PdfWriter.getInstance(document, new FileOutputStream(filename));
			
			document.open();
			
	        document.add(new Paragraph("########################### X COMPANY HR SYSTEM #########################"));
	        document.add(new Paragraph(" "+"Employee Name: " + name + "\n Position: " + position + "\n Salary: " + salary
					+ "\n Employee ID: " + employeeID+" "));
	        document.add(new Paragraph("#################################################################"));

	        document.close();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
