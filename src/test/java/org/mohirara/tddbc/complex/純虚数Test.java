package org.mohirara.tddbc.complex;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class 純虚数Test {

	public static class 文字列表記の取得 {

		@Test
		public void 虚部が4の時は文字列表記は4iが取得できる() {
			PurelyImaginaryNumber purelyImaginaryNumber = new PurelyImaginaryNumber(4);
			String actual = purelyImaginaryNumber.getNotation();
			assertEquals("4i", actual);
		}

		@Test
		public void 虚部が3の時は文字列表記は3iが取得できる() {
			PurelyImaginaryNumber purelyImaginaryNumber = new PurelyImaginaryNumber(3);
			String actual = purelyImaginaryNumber.getNotation();
			assertEquals("3i", actual);
		}

		@Test
		public void 虚部が1の時は文字列表記はiが取得できる() {
			PurelyImaginaryNumber purelyImaginaryNumber = new PurelyImaginaryNumber(1);
			String actual = purelyImaginaryNumber.getNotation();
			assertEquals("i", actual);
		}

		@Test
		public void 虚部がマイナス1の時は文字列表記はマイナスiが取得できる() {
			PurelyImaginaryNumber purelyImaginaryNumber = new PurelyImaginaryNumber(-1);
			String actual = purelyImaginaryNumber.getNotation();
			assertEquals("-i", actual);
		}
	}

	public static class 虚部の定義 {

		@Test
		public void 虚部が0ではならない() throws IllegalArgumentException {
			try {
				new PurelyImaginaryNumber(0);
				fail();
			} catch (IllegalArgumentException e) {
				// OK
			}
		}
	}

	public static class 等価性の判定 {
		@Test
		public void 純虚数4iと純虚数4iは等価である() {
			assertTrue(new PurelyImaginaryNumber(4).isSame(new PurelyImaginaryNumber(4)));
		}

		@Test
		public void 純虚数4iと純虚数3iは等価でない() {
			assertFalse(new PurelyImaginaryNumber(4).isSame(new PurelyImaginaryNumber(3)));
		}
	}

	public static class 共役の取得 {
		@Test
		public void 純虚数4iからマイナス4iが取得出来る() {
			PurelyImaginaryNumber purelyImaginaryNumber = new PurelyImaginaryNumber(4);
			assertTrue(new PurelyImaginaryNumber(-4).isSame(purelyImaginaryNumber.getConjugate()));
		}
	}
}
