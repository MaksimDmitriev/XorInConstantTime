package xor;

import org.junit.Assert;
import org.junit.Test;

public class XorTest {

	@Test
	public void xorModZero() {

	}

	@Test
	public void xorModOne() {

	}

	@Test
	public void xorModTwo() {

	}

	@Test
	public void xorModThree() {

	}

	private int getXorInLinearTime(int to) {
		int res = to;
		for (int i = to + 1; i <= -1; i++) {
			res ^= i;
		}
		return res;
	}
}
