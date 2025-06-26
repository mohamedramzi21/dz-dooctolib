package tabib.dzdoctolib;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tabib.dzdoctolib.entities.UtilisateurEntity;
import tabib.dzdoctolib.repositories.UtilisateurRepository;

import java.util.List;

@SpringBootApplication
public class DzDoctolibApplication {
	public static void main(String[] args) {

		SpringApplication.run(DzDoctolibApplication.class, args);
	}

	/*@Bean
	CommandLineRunner start(UtilisateurRepository utilisateurRepository) {
		return args -> {
			UtilisateurEntity ut = UtilisateurEntity.builder()
					.id(1241L)
					.nom("Hamadi")
					.email("hamadiramzi@gmail.com")
					.role("etudiant")
					.motdepasse("hamadiramzi2003")
					.build();
			utilisateurRepository.save(ut);
			utilisateurRepository.save(UtilisateurEntity.builder()
					.nom("oussama")
					.email("belkadioussama@gmail.com")
					.id(1234L)
					.motdepasse("belkadiouss2002")
					.role("etudiant")
					.build());
			List<UtilisateurEntity> utilisateurEntities = utilisateurRepository.findAll();
			utilisateurEntities.forEach(utilis -> {
				System.out.println(utilis.toString());
			});
		};
	}*/
}
