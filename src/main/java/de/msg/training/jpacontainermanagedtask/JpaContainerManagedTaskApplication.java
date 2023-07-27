package de.msg.training.jpacontainermanagedtask;

import de.msg.training.jpacontainermanagedtask.model.Author;
import de.msg.training.jpacontainermanagedtask.repository.AuthorRepository;
import de.msg.training.jpacontainermanagedtask.repository.impl.AuthorRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaContainerManagedTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaContainerManagedTaskApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(JpaContainerManagedTaskApplication.class, args);

//Create the repository
		AuthorRepository repository = context.getBean(AuthorRepository.class);


//Print the current author list
		System.out.println("Authors after the addition: ");
		repository.findAll();

//Create the author
		Author author = new Author();
		author.setFirstName("H.P.");
		author.setLastName("Lovecraft");
		repository.save(author);

//Save the author
// repository.save(author);

//Print the new author list
		System.out.println("Authors after the addition: ");
		System.out.println(repository.findAll());
	}

}
