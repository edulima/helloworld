package employee_stuff;

public class Consultant implements IPayable {
	
	private String cName;
	private float  cDailyRate;
	private float cDaysWorked;
	
	public Consultant(String name) {	
		setName(name);
	}
	
	public Consultant(String name, float dailyRate) {
		this(name);
		setDailyRate(dailyRate);
	}
	
	public Consultant(String name, float dailyRate, float daysWorked) {
		this(name, dailyRate);
		setDaysWorked(daysWorked);
	}

	public String getName () {
		return cName;
	}
	
	public boolean setName (String name) {
		if(name.length() > 0 ) {
			cName = name;
			return true;
		} else {
			return false;
		}
	}
	
	public float getDailyRate () {
		return cDailyRate;
	}
	
	public boolean setDailyRate (float dailyRate) {
		if (dailyRate > 0) {
			cDailyRate = dailyRate;
			return true;
		} else {
			return false;
		}
	}
	
	public float getDaysWorked () {
		return cDaysWorked;
	}
	
	public boolean setDaysWorked (float daysWorked) {
		if (daysWorked > 0) {
			 cDaysWorked = daysWorked;
			return true;
		} else {
			return false;
		}	
	}
	
	public float calcPay() {
		return cDailyRate * getDaysWorked();
	}
}
