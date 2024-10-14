package collectionDemo;
import java.math.BigDecimal;
import java.util.HashSet;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hashSetObj = new HashSet();
		hashSetObj.add(500000);
		hashSetObj.add(BigDecimal.ONE);
		hashSetObj.add("Srikumar");

		System.out.println(hashSetObj);
	}

	public void printHashSetObj(HashSet hashSetObj) {
		int i=1;
		for(Object currObj : hashSetObj) {
			System.out.println((i++)+") " + currObj);
		}
	}
}
