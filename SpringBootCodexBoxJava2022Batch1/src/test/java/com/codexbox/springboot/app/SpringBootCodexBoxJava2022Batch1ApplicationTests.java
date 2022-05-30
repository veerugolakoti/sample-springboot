package com.codexbox.springboot.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class SpringBootCodexBoxJava2022Batch1ApplicationTests {

	@Test

	public void sampleset(){
		HashSet<String>name=new HashSet<>();
		name.add("abc");
		name.add("dfg");
		name.add("cvb");
		name.add("cvb");
		System.out.println("enter the 1 value :"+ name);


	}

}
