package employee_stuff;

public class SalesEmployee extends Employee {
	
	private float commissionRate;
	private float salesTotal;
	
	
	public SalesEmployee(int thisNumber) {
		super(thisNumber);
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(int thisNumber, float newSalary) {
		super(thisNumber, newSalary);
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(int number, String name, float salary) {
		super(number, name, salary);
		// TODO Auto-generated constructor stub
	}
	
	public SalesEmployee(int number, String name, float salary, float commissionRate) {
		super(number, name, salary);
		setCommissionRate(commissionRate);
	}
	
	public SalesEmployee(int number, String name, float salary, float commissionRate, float salesTotal) {
		super(number, name, salary);
		setCommissionRate(commissionRate);
		setSalesTotal(salesTotal);
	}
	
	public float getSalesTotal() {
		return salesTotal;
	}
	
	public boolean setSalesTotal (float newSalesTotal) {
		
		if(newSalesTotal > 0 ) {
			salesTotal = newSalesTotal;
			return true;
		} else {
			return false;
		}
		
	}
	
	public float getCommissionRate() {
		return commissionRate;
	}
	
	public boolean setCommissionRate (float newCommissionRate) {
		
		if(newCommissionRate > 0 ) {
			log.info("Employee " + super.getName() + "changed commission from: " + commissionRate  + "to " + newCommissionRate);
			commissionRate = newCommissionRate;
			return true;
		} else {
			return false;
		}
		
	}

	public float calcPay() {
		return super.calcPay() + (commissionRate * salesTotal);
	}
	
	
	

}
