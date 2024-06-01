package net.java.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.java.sms.entity.Student;
import net.java.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManmagentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManmagentSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
/*		Student student1 = new Student("Arun","kumar","arun@gmail.com");
		  studentRepository.save(student1);
		  
		  Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
			  studentRepository.save(student2);
*/		 
		
		
	}

}
