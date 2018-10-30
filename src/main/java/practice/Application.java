package practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("デプロイとサーバ起動を行います");
		SpringApplication.run(Application.class, args);
	}
}
