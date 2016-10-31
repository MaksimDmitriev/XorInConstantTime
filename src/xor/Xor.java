package xor;

public class Xor {

	public static int getXorNeg(int a) {
		if (a > 0) {
			throw new IllegalArgumentException("a must be negative");
		}
		int res[] = { 0, a, 1, a - 1 };
		return res[-a % 4];
	}

}
