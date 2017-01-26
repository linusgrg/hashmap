package testpkg;

import java.util.List;

public class Student {

	String name;
	int roll;
	List<Subject> sub;
	
	
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public Student() {
		super();
	}
	public Student(String name, int roll, List<Subject> sub) {
		super();
		this.name = name;
		this.roll = roll;
		this.sub = sub;
	}
	public List<Subject> getSub() {
		return sub;
	}
	public void setSub(List<Subject> sub) {
		this.sub = sub;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
}
