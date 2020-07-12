package FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorClient {

	public int method1(BinaryOperator<Integer> binaryoperator, int i, int j) {
		return binaryoperator.apply(i, j);

	}

	public int method2(IntBinaryOperator binaryoperator, int i, int j) {
		return binaryoperator.applyAsInt(i, j);

	}

	public static void main(String[] args) {
		BinaryOperatorClient client = new BinaryOperatorClient();

		int result = client.method1((i, j) -> i + j, 10, 20);
		System.out.println("result: " + result); 

		result = client.method2((i, j) -> i + j, 10, 20);
		System.out.println("result: " + result); 

	}


    
}