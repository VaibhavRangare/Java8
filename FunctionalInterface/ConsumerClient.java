package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerClient {

	public void method1(Consumer<Integer> consumer, int i) {
		consumer.accept(i);
	}

	// IntConsumer, DoubleConsumer, LongConsumer
	public void method2(IntConsumer consumer, int i) {
		consumer.accept(i);
	}

	public void method3(BiConsumer<Integer, Double> consumer, int i, double d) {
		consumer.accept(i, d);
	}

	public void method4(ObjIntConsumer<Integer> consumer, int i, int j) {
		consumer.accept(i, j);
	}

	public static void main(String[] args) {
		ConsumerClient client = new ConsumerClient();

		client.method1((d) -> System.out.println(d), 10); 
		client.method1(System.out::print, 20); 
		System.out.println("\n");

		client.method2((d) -> System.out.println(d), 10); 
		client.method2(System.out::print, 20); 
		System.out.println("\n");

		client.method3((i, d) -> System.out.println(i + ", " + d), 10, 50.5); 
		// client.method3(System.out::print, 20, 70.5); // compilation error

		client.method4((i, d) -> System.out.println(i + ", " + d), 10, 50); 
	}


    
}