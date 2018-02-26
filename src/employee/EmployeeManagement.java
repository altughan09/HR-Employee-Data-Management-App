package employee;

import java.util.ArrayList;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.List;

public class EmployeeManagement {

	public static void main(String[] args) throws DocumentException {

		add();

		/*
		 * Employee emp1 = new Employee("Adam Cave", "Accountant", "8000");
		 * emp1.showInfo();
		 * emp1.writeOut("C:\\Users\\Altug\\Desktop\\employeedetails_PDF.pdf");
		 */

	}

	private static void add() throws DocumentException {

		ArrayList<Employee> employeeList = new ArrayList();
		employeeList.add(new Employee("Adam Cave", "Accountant", "7000 PLN"));
		employeeList.add(new Employee("Kevin Haborn", "Manager", "9000 PLN"));
		employeeList.add(new Employee("Elisa Mane", "Senior Accountant", "8000 PLN"));
		employeeList.add(new Employee("Adam Ham", "Developer", "8000 PLN"));
		System.out.println(employeeList);
		
		for (Employee str : employeeList) {
			str.writeOut("C:\\Users\\Altug\\Desktop\\"+str.getName()+" "+str.getEmployeeID()+ " Employee details.pdf");
		}

	}

}
