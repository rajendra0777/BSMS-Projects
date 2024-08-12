package in.ashokit;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	public List Course;
	public Set <String> name;
	public Map<String,String> contact;
	
	
	public void setCourse(List course) {
		Course = course;
	}
	public void setName(Set<String> name) {
		this.name = name;
	}
	public void setContact(Map<String, String> contact) {
		this.contact = contact;
	}
	
	/*
	 * 
	 * @Override
	public String toString() {
		return "Student [Course=" + Course + ", name=" + name + ", contact=" + contact + "]";
	}
	 */
	
	

}
