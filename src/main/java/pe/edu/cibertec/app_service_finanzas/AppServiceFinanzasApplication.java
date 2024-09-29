package pe.edu.cibertec.app_service_finanzas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppServiceFinanzasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppServiceFinanzasApplication.class, args);
	}

}
