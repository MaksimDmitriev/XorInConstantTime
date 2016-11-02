package xor;

import org.junit.Assert;
import org.junit.Test;

public class XorTest {

	@Test
	public void xorNegModZero() {
		int value = -84;
		int res = Xor.getXorInLinearTime(value, 0);
		Assert.assertEquals(res, Xor.getXorNeg(value));
	}

	@Test
	public void xorNegModOne() {
		int value = -145;
		int res = Xor.getXorInLinearTime(value, 0);
		Assert.assertEquals(res, Xor.getXorNeg(value));
	}

	@Test
	public void xorNegModTwo() {
		int value = -42;
		int res = Xor.getXorInLinearTime(value, 0);
		Assert.assertEquals(res, Xor.getXorNeg(value));
	}

	@Test
	public void xorNegModThree() {
		int value = -43;
		int res = Xor.getXorInLinearTime(value, 0);
		Assert.assertEquals(res, Xor.getXorNeg(value));
	}

	@Test
	public void xorPosModZero() {
		int value = 84;
		int res = Xor.getXorInLinearTime(0, value);
		Assert.assertEquals(res, Xor.getXorPos(value));
	}

	@Test
	public void xorPosModOne() {
		int value = 145;
		int res = Xor.getXorInLinearTime(0, value);
		Assert.assertEquals(res, Xor.getXorPos(value));
	}

	@Test
	public void xorPosModTwo() {
		int value = 42;
		int res = Xor.getXorInLinearTime(0, value);
		Assert.assertEquals(res, Xor.getXorPos(value));
	}

	@Test
	public void xorPosModThree() {
		int value = 47;
		int res = Xor.getXorInLinearTime(0, value);
		Assert.assertEquals(res, Xor.getXorPos(value));
	}

	@Test
	public void xorLeftAndRightPositive() {
		int from = 47;
		int to = 67;
		int res = Xor.getXorInLinearTime(from, to);
		Assert.assertEquals(res, Xor.getXor(from, to));
	}

	@Test
	public void xorLeftAndRightNegative() {
		int from = -67;
		int to = -47;
		int res = Xor.getXorInLinearTime(from, to);
		Assert.assertEquals(res, Xor.getXor(from, to));
	}
	
	@Test
	public void xorEquals() {
		int from = -67;
		int to = -67;
		int res = Xor.getXorInLinearTime(from, to);
		Assert.assertEquals(res, Xor.getXor(from, to));
	}

	@Test
	public void xorLeftNegativeAndRightPositive() {
		int from = -47;
		int to = 67;
		int res = Xor.getXorInLinearTime(from, to);
		Assert.assertEquals(res, Xor.getXor(from, to));
	}

	@Test(expected = IllegalArgumentException.class)
	public void xorPosWithNegative() {
		Xor.getXorPos(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void xorNegWithPositive() {
		Xor.getXorNeg(90);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void xorInvalidRange() {
		Xor.getXor(10, 9);
	}
}
