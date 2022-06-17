package main;

import jdbcConnections.PreparedStatementExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
	public static void main(String[] args) {
		PreparedStatementExample ps=new PreparedStatementExample();
		try {
			ps.myPrepared();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}}
		/*JdbcExample jdbc=new JdbcExample();
		try {
			jdbc.myJdbcExample();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}*/
		/*ExecutionFrameworkExample executionFrameworkExample= new ExecutionFrameworkExample();
		ExecutorService executorService=Executors.newFixedThreadPool(4);
			executorService.submit(executionFrameworkExample);
	}}*/
	/*	GenerateOtp otp=new GenerateOtp();
		otp.generateOTP();
	}}*/
/*		ThreadExample thread=new ThreadExample();
		System.out.println(thread.getState());
		thread.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(thread.getState());
		try {
			thread.join();
			System.out.println("iam joining my new thread");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
   		System.out.println(thread.getState());
	}}*/
	/*	RunableExample runableExample =new RunableExample();
		Thread thread=new Thread(runableExample);
		System.out.println(thread.getState());
	}}*/

/*		ThreadExample threadExample=new ThreadExample();
		threadExample.run();

		ThreadExample threadExample1=new ThreadExample();
		System.out.println(threadExample1.getName());
		System.out.println(threadExample1.getId());

		ThreadExample threadExample2=new ThreadExample();
		System.out.println(threadExample2.getName());
		System.out.println(threadExample2.getId());
	}
}*/
		/*ArrayStream as=new ArrayStream();
		try {
			as.myArrayStream();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	}*/
	/*	BufferedStream bs = new BufferedStream();
		try {
			bs.myBuffered();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}*/
/*		IoStreamExample io = new IoStreamExample();
		try {
			io.myIostreem();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}*/

		//int count = 1;
	/*	List<Employee> empList = new ArrayList<>();
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
	}*/

	/*	StudentGrade studentGrade=new StudentGrade();
		studentGrade.studentGrades();*/