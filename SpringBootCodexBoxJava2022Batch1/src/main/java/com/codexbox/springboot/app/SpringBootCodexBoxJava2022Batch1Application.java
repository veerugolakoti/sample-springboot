package com.codexbox.springboot.app;

import com.codexbox.springboot.app.codexbox.Collections.LanguagesList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.ParameterizedType;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		List<LanguagesList> mylanguageslist = new LinkedList();
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<=3; i++){
			LanguagesList ll = new LanguagesList();
			System.out.println("Employee " + i + " Details");
			System.out.println("Enter Language Name : " );
			String name = sc.next();
			System.out.println("Enter Version: ");
			double version = sc.nextDouble();
			System.out.println("Enter Developer Name : ");
			String developername = sc.next();

			ll.setDevelopername(name);
			ll.setVersion(version);
			ll.setDevelopername(developername);

			mylanguageslist.add(ll);

		}
		System.out.println("Size of my list :" + mylanguageslist.size());
	}

}
