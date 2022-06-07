package com.codexbox.springboot.app;

import com.codexbox.springboot.app.fileinputstream.FileInputStreamExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
	public static void main(String[] args) throws IOException {
		FileInputStreamExample fis = new FileInputStreamExample();
		fis.filecounting();
	}
}
