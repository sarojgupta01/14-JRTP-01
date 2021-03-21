package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class SpringDataJpa01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpa01Application.class, args);
		
		UserDtlsRepository dtlsRepository= context.getBean(UserDtlsRepository.class);
		UserDtls user= new UserDtls();
		user.setUserId(103);
		user.setUserName("bbb");
		user.setUserAge(21);
		user.setUserEmail("rutika_shetty@gmail.com");
		user.setUserCountry("India");
		dtlsRepository.save(user);
		System.out.println("Record saved Successfully...!");
	}

}
