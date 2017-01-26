package testpkg;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		ControllerClass cntrlclass = new ControllerClass();
	//	Student  std=	cntrlclass.getStudentInfo("one");
		//System.out.println(std.name +"--"+std.getRoll()+"---"+std.getSub().get(0).course+"---"+std.getSub().get(1).getCourse());
		
	//	Student  std1=	cntrlclass.getStudentInfo("two");
	//	System.out.println(std1.name +"--"+std1.getRoll()+"---"+std1.getSub().get(0).course+"---"+std1.getSub().get(1).getCourse());
		
     	Student  std2=	cntrlclass.getStudentInfo("three");
		System.out.println(std2.name +"--"+std2.getRoll()+"---"+std2.getSub().get(0).course+"---"+std2.getSub().get(1).getCourse());
		

		
		
	}

}
