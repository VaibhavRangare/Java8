package FunctionalInterface;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
public class FunctionClient {

	public int method1(Function<Integer, Integer> function, int i) {
		return function.apply(i);
	}

	public double method2(Function<Integer, Double> function, int i) {
		return function.apply(i);
	}

	public int method3(IntFunction<Integer> function, int i) {
		return function.apply(i);
	}

	public double method4(BiFunction<Integer, Double, Double> function, int i, double j) {
		return function.apply(i, j);
	}

	public double method5(ToDoubleFunction<Integer> function, int i) {
		return function.applyAsDouble(i);
	}

	public int method6(ToIntFunction<Integer> function, int i) {
		return function.applyAsInt(i);
	}

	public int method7(ToIntBiFunction<Integer, Integer> function, int i, int j) {
		return function.applyAsInt(i, j);
	}

	public static void main(String[] args) {
		FunctionClient client = new FunctionClient();

		int result = client.method1((i) ->  i + 10, 10);
		System.out.println("result: " + result); 

		double result1 = client.method2((i) -> i + 10.5, 10);
		System.out.println("result: " + result1); 

		int result2 = client.method3((i) -> i + 10, 10);
		System.out.println("result: " + result2); 

		double result3 = client.method4((i, j) ->  i + j, 10, 20.5);
		System.out.println("result: " + result3); 

		double result4 = client.method5((i) -> i + 10.5, 10);
		System.out.println("result: " + result4); 

		int result5 = client.method6((i) -> i + 10, 10);
		System.out.println("result: " + result5); 

		int result6 = client.method7((i, j) -> i + j, 10, 20);
		System.out.println("result: " + result6); 

	}


    
}
