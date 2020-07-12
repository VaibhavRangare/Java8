package Comparator;

import java.util.Comparator;

public class IDComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.getId() - e2.getId();
	}
}
