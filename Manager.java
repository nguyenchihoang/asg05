package nguyenchihoang;


public class Manager extends Employee {
	private Employee assistant;
	Manager(String name, String date, double c) {
		super(name, date, c);
		// TODO Auto-generated constructor stub
	}
	Manager(String name, String date, double c,Employee d) {
		super(name, date, c);
		assistant=d;
	}
	public void setAssistant(Employee a){
		assistant=a;
	}
	public String toString(){
		return super.toString()+assistant.toString();
	}

}
