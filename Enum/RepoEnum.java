package Enum;

public enum RepoEnum {
	ADD(10), DELETE(20), Update(30) {
		 public void additionalMethod() {
		 System.out.println("Overriden");
		 }
	};
	int item;

	private RepoEnum(int i) {
		this.item = i;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		System.out.println("setting new item:" + item);
		this.item = item;
	}

	public void additionalMethod() {
		System.out.println("Original");
	}


    
}