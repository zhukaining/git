package qingao.gitss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="qingao.gitss")
public class App 
{
   public static void main(String[] args) throws Exception {
	SpringApplication.run(App.class, args);
}

}
