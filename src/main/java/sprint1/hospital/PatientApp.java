package sprint1.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientApp {

	public static void main(String[] args) {
		SpringApplication.run(PatientApp.class, args);
		System.out.println("Patient Module Started...");
	}
}