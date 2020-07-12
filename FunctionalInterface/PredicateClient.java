package FunctionalInterface;
import java.util.function.Predicate;
public class PredicateClient {

	public void testPredicate(Predicate<String> p, String s) {
		System.out.println(p.test(s));
	}

	public static void main(String[] args) {
		PredicateClient client = new PredicateClient();
		client.testPredicate((p) -> p.length() > 3, "Hello");
	}


    
}