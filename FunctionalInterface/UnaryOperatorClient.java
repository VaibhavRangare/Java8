package FunctionalInterface;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
public class UnaryOperatorClient {

	public int method1(UnaryOperator<Integer> unaryoperator, int i) {
		return unaryoperator.apply(i);
		
	}
	public int method2(IntUnaryOperator unaryoperator, int i) {
		return unaryoperator.applyAsInt(i);
		
	}
	public static void main(String[] args) {
		UnaryOperatorClient client = new UnaryOperatorClient();
		
		int result = client.method1(d->d+10, 10);
		System.out.println("Result:"+ result);
		
		result = client.method2(d->d+30, 10);
		System.out.println("Result:"+ result);
		
	}


    
}