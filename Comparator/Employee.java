package Comparator;

public class Employee {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int idd, String name1, int age1) {
		this.id = idd;
		this.name = name1;
		this.age = age1;
	}

	public String toString() {
		return "Employee:" + this.id + ",name:" + this.name + ",age:" + this.age;
	}
}
