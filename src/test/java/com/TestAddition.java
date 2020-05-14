package com;



import java.text.Annotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestAddition {

	@Test
	public void testAdd() {
		Addition ms=new Addition();
		Assertions.assertEquals(ms.add(5,9), 14);
	}
	
	@Test
	public void testAdd2() {
		Addition ms = new Addition();
		Assertions.assertNotEquals(ms.add(5,9), 13);
	}
	
	@Test
	public void testsubstract() {
		Addition ms = new Addition();
		Assertions.assertEquals(ms.substract(9,5), 4);
	}
	
	@Test
	public void testDivision() {
		Addition ms = new Addition();
		Assertions.assertEquals(ms.division(4,2), 2);
	}
	
	@Test
	public void testMultiply() {
		Addition ms = new Addition();
		Assertions.assertEquals(ms.multiply(5,9), 45);
	}
	
	@Test
	public void testConcat() {
		Addition ms = new Addition();
		Assertions.assertEquals(ms.concat("a","b"), "ab");
	}
}