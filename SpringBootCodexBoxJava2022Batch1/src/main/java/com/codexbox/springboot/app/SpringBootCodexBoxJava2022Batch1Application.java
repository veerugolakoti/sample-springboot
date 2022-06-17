package com.codexbox.springboot.app;

import com.codexbox.springboot.app.jdbc.JdbcExample;
import com.codexbox.springboot.app.thread.RunnableImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) throws SQLException {
		/*RunnableImpl runnable = new RunnableImpl();
		ExecutorService executors = Executors.newFixedThreadPool(2);
		for(int i =0; i<=3; i++) {

			executors.execute(runnable);
		}
		executors.shutdown();

*/
		JdbcExample jdbcExample = new JdbcExample();
		jdbcExample.employeeDetails();




	}
/*Thread.currentThread().setPriority(9);
		System.out.println("main thread priority " + Thread.currentThread().getPriority());
		DemoThread demoThread = new DemoThread(); //creating object to main thread
		System.out.println("priority of demo thread " + demoThread.getPriority());
	}*/
	/*	RunnableExample runnableExample = new RunnableExample();
		Thread thread = new Thread(runnableExample);
		thread.start();
		try {
			thread.sleep(100);


			System.out.println(thread.getState());

			//System.out.println(thread.getStackTrace());
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}}
*/

		/*ThreadExample threadExample = new ThreadExample();
		threadExample.run();

		ThreadExample threadExample1 = new ThreadExample();
		System.out.println(threadExample1.getName());
		System.out.println(threadExample1.getId());
		//System.out.println(threadExample1.getPriority());
		System.out.println(threadExample1.getState());

		ThreadExample threadExample2 = new ThreadExample();
		System.out.println(threadExample2.getName());
		System.out.println(threadExample2.getId());
		//System.out.println(threadExample2.getPriority(threadExample1));
	}}*/
		// System.out.println(threadExample2.getState());



















		/*IOStreamExample ios = new IOStreamExample();
		try {
			ios.ioStreamEx();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		*/

		/*StudentGradeAssessment assessment4 = new StudentGradeAssessment();
		assessment4.studentAndTheirGrades();*/
		/*Map<String, Integer> myHashMap = new HashMap<>();
		myHashMap.put("Name1", 1);
		myHashMap.put("Name1", 2);
		myHashMap.put(null, 3);
		myHashMap.put(null, 4);
		System.out.println(myHashMap.get(null));

		System.out.println(myHashMap);*/
//
//		List<Integer> testNumbers = new ArrayList<>();
//		testNumbers.add(1);
//		testNumbers.add(2);
//		testNumbers.add(3);
//		System.out.println(Seasons.SUMMER.name());
//		System.out.println(Seasons.SPRING.ordinal());
//		System.out.println(Seasons.SPRING.getValue());

	/*ListIterator myIterator = testNumbers.();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
			myIterator.previous()
		}

		for
		}*/

/*

	}
	{
		//int count = 1;
		List<Employee> empList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 29 ; i++) {

			System.out.println("Enter Employee" + i + " Details: ");
			System.out.println("Enter emp name: ");
			String name = scanner.next();
			System.out.println("Enter emp id: ");
			Integer id = scanner.nextInt();
			System.out.println("Enter emp address: ");
			String address = scanner.next();

			Employee employee = new Employee(name, id, address);
			empList.add(employee);
		}
		System.out.println("My total employees : " + empList.size());
	}
}

*/
	}