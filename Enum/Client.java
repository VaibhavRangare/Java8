package Enum;

public class Client {
    public static void main(String[] args) {
        for(RepoEnum t : RepoEnum.values())
		{
			System.out.println("t:"+ t +","+ t.getItem());
			t.setItem(20);
			System.out.println("t:"+ t +","+ t.getItem());
		}
		
		RepoEnum c = RepoEnum.Update;
		System.out.println(c.getItem());
		c.additionalMethod();
    }

}