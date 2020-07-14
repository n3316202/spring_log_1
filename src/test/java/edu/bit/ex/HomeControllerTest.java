package edu.bit.ex;

import java.lang.reflect.Method;

import org.junit.Test;

public class HomeControllerTest {

	@Test
	public void testClass() {
		
		Class cls = HomeController.class;
		
		Method m[] = cls.getDeclaredMethods();

		for (int i = 0; i < m.length; i++)
			System.out.println(m[i].toString());

	}

}
