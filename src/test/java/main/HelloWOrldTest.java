package main;

import org.junit.jupiter.api.Test;

public class HelloWOrldTest {
	@Test
	public void sayHelloTest() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.sayHello();
		helloWorld.sayHello();
	}
}
