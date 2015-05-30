package es.solrak.app;

import org.junit.Test;

public class App2Test {
	
	@Test(timeout=1000)
	public void test01() {
	}
	
	@Test
	public void test02() throws InterruptedException {
		Thread.sleep(1000);
	}
}
