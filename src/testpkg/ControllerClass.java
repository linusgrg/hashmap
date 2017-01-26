package testpkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ControllerClass {

	ServiceClass serObj=new ServiceClass();
	HashMap<String, List<Subject>>map= new HashMap<>();
	
	public  Student getStudentInfo(String code){
		
		Student s1=new Student("RAM",1);
		map.put("one", serObj.getListSubject1());
		map.put("two", serObj.getListSubject2());
		map.put("three", serObj.getListSubject3());
		s1.setSub(map.get(code));	
	
		return s1;
	}
	
}
