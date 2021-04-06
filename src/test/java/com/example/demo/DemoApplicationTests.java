package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
	DemoApplication demoApplication;

	@Test
	public void sayHelloTest(){
		String response = demoApplication.sayHello();
		assertEquals("Hello",response);

	}

//	@Test
//	void contextLoads() {
//	}

}
