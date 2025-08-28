package com.Preparation;

import java.util.ArrayList;
import java.util.List;

public class Engine {

	public static void engineMethod() {
		
		C1Request req = new C1Request();
		
		req.setName("Vaani");
		req.setAge(22);
		
		Applicant app = new Applicant();
		List<Applicant> liapp = new ArrayList<>();
		
		app.setAddress("40dr");
		app.setFirstseen("first");
		app.setLastseen("last");
		
		liapp.add(app);
		
		req.setApplicant(liapp);
		
		System.out.println(req);
		
	}
	
	public static void main(String[] args) {
		engineMethod();
	}
}
