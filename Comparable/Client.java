package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(5);
		Employee e3 = new Employee(3);
		Employee e4 = new Employee(2);
		Employee e5 = new Employee(1);
		Employee e6 = new Employee(9);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		Collections.sort(l);

		System.out.println("Sorted List:" + l);

		

	}


    
}