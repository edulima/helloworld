package app;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

import employee_stuff.BadNumber;
import employee_stuff.Consultant;
import employee_stuff.Employee;
import employee_stuff.PayrollSystem;
import employee_stuff.SalesEmployee;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	
	
	try {
		
		//Exercise 5.2 pg 47
		Employee a = new Employee(1, "A. Smith", 50000);
		Employee b = new Employee(2, "B. Jones", 60000);
		Employee c = new Employee(3, "C. Doe", 70000);
		Employee d = new Employee(4, "D. Wong", 80000);
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		emps.add(a);
		emps.add(b);
		emps.add(c);
		emps.add(d);
		
		for(Object x: emps) {
			Employee e  = (Employee) x;
			System.out.println(e.getName() +
					" earns: " + e.calcPay());
		}
			
		//Class eClass = Class.forName("employee_stuffy");			
		//Employee emp1 = (Employee) eClass.newInstance();
			
		Employee emp1 = new Employee(10, "Fred Smith", 8000.00f);
		SalesEmployee spEmp = new SalesEmployee(10, "Fred SMith", 30000.00f, 0.10f, 1000.00f);
		PayrollSystem ps = new PayrollSystem();
				
		/**
		 * 
		 * Employee instance
		 * 
		 */
		float empPay    = ps.netPay(emp1);
		float empSalary = empPay;
		String empName  = emp1.getName();
		int empNumber   = emp1.getNumber();
		
	
		String empMessage = String.format("Name: %s Number: %d Salary: £%.2f", empName, empNumber, empSalary);
		System.out.println("Employee object: " +  empMessage);
				
		/**
		 * 
		 * Sales Employee instance
		 * 
		 */
		int spNumber = spEmp.getNumber();
		float spSalary = spEmp.getSalary();
		float spCommissionRate = spEmp.getCommissionRate();
		float spSalesTotal = spEmp.getSalesTotal();
		String spName = spEmp.getName();
		
		String spMessage = 
				String.format(
						"Employee: %d " +
						"Employee Name: %s,  " +
						"Year Salary: £%.2f, " +
						"Monthly Gross Salary: £%.2f " +
						"Commission rate: %.2f " +
						"Sale Total: £%.2f",
					    spNumber, spName, spSalary, spEmp.calcPay(), 
					    spCommissionRate, spSalesTotal);
		
		System.out.println("Sales Employee object: " + spMessage);
		
		/**
		 * 
		 * Consultant instance
		 * 
		 */
		Consultant cons = new Consultant("Thomas", 10, 20);
		
		float  consRate = cons.getDailyRate();
		float  consDaysWorked = cons.getDaysWorked();
		String consName = cons.getName();
		
		String consMessage = 
				String.format(
						"Name: %s " +
						"Daily Rate: %.2f " +
						"Days worked: %.2f "+
						"Salary: %.2f ",
						consName, consRate, consDaysWorked, cons.calcPay());
		
		System.out.println("Consultant object:" + consMessage);	
		
		
		
		setupLog();
		
	} catch (RuntimeException e) {
		System.out.println("Run time exception" + e.getMessage());
	}
	

	}
	
	static Logger log = Logger.getLogger("");
	
	private static void setupLog() {
		log.setLevel(Level.INFO);
	}
}
