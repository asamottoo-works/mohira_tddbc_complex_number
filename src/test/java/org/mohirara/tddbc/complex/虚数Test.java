package org.mohirara.tddbc.complex;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class 虚数Test {

	public static class 文字列表記の取得 {

		@Test
		public void 実部が2であり虚部は3() {
			String actual = new ImaginaryNumber(2, 3).getNotation();
			assertEquals("2 + 3i", actual);
		}
		@Test
		public void 実部が2であり虚部はマイナス3() {
			String actual = new ImaginaryNumber(2, -3).getNotation();
			assertEquals("2 - 3i", actual);
		}
		@Test
		public void 実部が2であり虚部は1() {
			String actual = new ImaginaryNumber(2, 1).getNotation();
			assertEquals("2 + i", actual);
		}
		@Test
		public void 実部が2であり虚部はマイナス1() {
			String actual = new ImaginaryNumber(2, -1).getNotation();
			assertEquals("2 - i", actual);
		}
	}
}
