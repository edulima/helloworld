package employee_stuff;
import java.util.logging.Logger;

public class Employee implements IPayable {

	private int number;
	protected float salary;
	private String name;
	private final float MIN_SALARY = 7000;
	
	public Employee(int thisNumber) {
		setNumber(thisNumber);
	}
	
	public Employee(int thisNumber, float newSalary) {
		this(thisNumber);  
		setSalary(newSalary);
	}
	
	public Employee(int number, String name, float salary) {
		this(number, salary);
		setName(name);
	}
	
	public int getNumber(){
		return number;
	}
	
	public boolean setNumber(int thisNumber) {
		if (thisNumber > 0){
			number = thisNumber;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean setNumber(String thisNumber) throws BadNumber {
		try {
			int i = Integer.parseInt(thisNumber);
			return setNumber(i);	
		} catch (NumberFormatException e) {
			throw new BadNumber(e);
		}
	}
	
	public float getSalary(){
		return salary;
	}
	
	public boolean setSalary(float thisSalary) {
		 
		if (thisSalary > 0 && thisSalary > MIN_SALARY) {
			log.info("Employee " + number + "changed salary from: " + this.salary + "to " + thisSalary);
			salary = thisSalary;
			return true;
		} else {
			salary = MIN_SALARY;
			return false;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public boolean setName(String thisName) {
		if (thisName.length() > 0) {
			name = thisName;
			return true;
		} else {
			return false;
		}
	}
	
	public float calcPay() {
		return getSalary() / 12;
	}

	/**
	 * This is a static variable 
	 * It is declared as protected so it can also be used in the SalesEmployee class
	 */
	protected static Logger log = Logger.getLogger(Employee.class.getName());
}
