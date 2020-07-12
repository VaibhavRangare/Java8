package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "ab", 10);
		Employee e2 = new Employee(3, "cd", 9);
		Employee e3 = new Employee(5, "ef", 5);
		Employee e4 = new Employee(2, "gh", 7);
		Employee e5 = new Employee(9, "ij", 2);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		Collections.unmodifiableCollection(l);
		Collections.sort(l, new AgeComparator());
		System.out.println(l);
		Collections.sort(l, new NameComparator());
		System.out.println(l);
		Collections.sort(l, new IDComparator());
		System.out.println(l);
		Collections.sort(l, (a, b) -> a.getName().compareTo(b.getName()));
		System.out.println(l);
	}

}
