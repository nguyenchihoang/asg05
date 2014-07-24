package nguyenchihoang;

public class Person {
	private String name;
	private String birthday;
	Person(String name, String birthday){
		this.name=name;
		this.birthday=birthday;
	}
	public void setName(String c){
		name=c;
	}
	public String getName(){
		return name;
	}
	public String getBirthday(){
		return birthday;
	}
	public String toString(){
		return "Name" + name + "birthday" + birthday;
	}

}
