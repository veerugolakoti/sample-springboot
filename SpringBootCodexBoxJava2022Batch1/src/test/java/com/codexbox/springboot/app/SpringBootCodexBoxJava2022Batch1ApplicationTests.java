package com.codexbox.springboot.app;

import com.codexbox.junaidspringboot.app.springboot.StackExamples;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootCodexBoxJava2022Batch1ApplicationTests {

	@Test
	void contextLoads() {
		StackExamples stackExamples = new StackExamples();
		stackExamples.getTypeSafetyStackValues();
	}

}
