package com.codexbox.springboot.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class SpringBootCodexBoxJava2022Batch1ApplicationTests {

	@Test
	public void hashsetExample(){
		HashSet<String>hashSet=new HashSet<>();
		hashSet.add("divya");
		hashSet.add("mounika");
		hashSet.add("divya");
		hashSet.add("dinesh");
		hashSet.add("sohail");
		hashSet.add("vamshi");
		System.out.println("duplicate value from my list : " +hashSet);
	}

}
