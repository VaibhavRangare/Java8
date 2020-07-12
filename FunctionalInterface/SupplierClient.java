package FunctionalInterface;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierClient {

	public int method1(Supplier<Integer> s) {
		return s.get();
	}

	public int method2(IntSupplier s) {
		return s.getAsInt();
	}

	public boolean method3(BooleanSupplier s) {
		return s.getAsBoolean();
	}

	public static void main(String[] args) {

		SupplierClient client = new SupplierClient();

		int number = client.method1(()->new Double(5).intValue());
		System.out.println("number: " + number);
        number = client.method1(()->new Integer(5).intValue());
        System.out.println("number: " + number);
		number = client.method2(() -> {
			Random random = new Random();
			return random.nextInt();
		});
		System.out.println("number: " + number);

		Boolean b = client.method3(() -> {
			return true;
		});
		System.out.println("Boolean: " + b);

	}


    
}