package nguyenchihoang;


public class Employee extends Person {

	private double salary;
	Employee(String name, String date, double c){
		super(name, date);
		salary=c;
		
	}
	public double getSalary(){
		return salary;
	}
	
	public String toString(){
		return super.toString()+salary;
	}
	
}
