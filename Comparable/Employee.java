package Comparable;

public class Employee implements Comparable<Employee> {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(int idd) {
		this.id = idd;
	}

	public int compareTo(Employee e) {
		return this.id - e.id;
	}

	public String toString() {
		return "Employee id:" + this.id;
	}
}
