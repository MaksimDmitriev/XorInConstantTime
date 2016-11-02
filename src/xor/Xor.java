package xor;

public class Xor {

	public static int getXorNeg(int x) {
		if (x > 0) {
			throw new IllegalArgumentException("x cannot be positive");
		}
		int res[] = { 0, x, 1, x - 1 };
		return res[-x % 4];
	}

	public static int getXorPos(int a) {
		if (a < 0) {
			throw new IllegalArgumentException("a cannot be negative");
		}
		int[] res = { a, 1, a + 1, 0 };
		return res[a % 4];
	}

	public static int getXor(int a, int b) {
		if (a > b) {
			throw new IllegalArgumentException("a must be greater than b");
		}
		if (b < 0) { // both a and b are negative
			return getXorNeg(a) ^ getXorNeg(b + 1);
		} else if (a > 0) { // both a and b are positive
			return getXorPos(b) ^ getXorPos(a - 1);
		} else { // a is negative, and b is positive
			return getXorNeg(a) ^ getXorPos(b);
		}
	}

	public static int getXorInLinearTime(int a, int b) {
		if (a > b) {
			throw new IllegalArgumentException("a must be greater than b");
		}
		int res = a;
		for (int i = a + 1; i <= b; i++) {
			res ^= i;
		}
		return res;
	}

}
