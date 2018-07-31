import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class RemPrimesFromList {

	static List<Integer> primeList = new ArrayList<Integer>();

	public static boolean isPrime(int n) {
		boolean flag = true;
		if (n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;

			} else {
				flag = true;
			}
		}
		return flag;
	}

	public static List<Integer> remPrimes(List<Integer> integers) {

		Iterator listIterator = integers.iterator();

		while (listIterator.hasNext()) {
			Integer integer = (Integer) listIterator.next();

			if (!isPrime(integer)) {
				primeList.add(integer);
			}

		}
		return primeList;
	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(2);
		l.add(6);
		l.add(7);
		l.add(9);

		remPrimes(l);

		System.out.println(primeList);
	}

	private static char[] primeList() {
		// TODO Auto-generated method stub
		return null;
	}
}