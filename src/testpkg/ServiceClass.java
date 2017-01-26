package testpkg;

import java.util.ArrayList;
import java.util.List;

public class ServiceClass {
	
	
	public List<Subject> getListSubject1(){
		
		List<Subject> sub1=new ArrayList();
		sub1.add(new Subject("c1"));
		
		sub1.add(new Subject("d1"));
		
		
		return sub1;
		
		
	}
	
public List<Subject> getListSubject2(){
		
		List<Subject> sub1=new ArrayList();
		sub1.add(new Subject("c2"));
		
		sub1.add(new Subject("d2"));
		
		
		return sub1;
		
		
	}

public List<Subject> getListSubject3(){
	
	List<Subject> sub1=new ArrayList();
	sub1.add(new Subject("c3"));
	
	sub1.add(new Subject("d3"));
	
	
	return sub1;
	
	
}

}
