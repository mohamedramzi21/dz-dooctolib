package tabib.dzdoctolib;

import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tabib.dzdoctolib.entities.utilisateur;
import tabib.dzdoctolib.repositories.utilisateurRepository;

import java.util.List;

@SpringBootApplication
public class DzDoctolibApplication {
	public static void main(String[] args) {

		SpringApplication.run(DzDoctolibApplication.class, args);
	}

	@Bean
	CommandLineRunner start(utilisateurRepository utilisateurRepository) {
		return args -> {
			utilisateur ut = utilisateur.builder()
					.id((long) 1241L)
					.nom("Hamadi")
					.email("hamadiramzi@gmail.com")
					.role("etudiant")
					.motdepasse("hamadiramzi2003")
					.build();
			utilisateurRepository.save(ut);
			utilisateurRepository.save(utilisateur.builder()
					.nom("oussama")
					.email("belkadioussama@gmail.com")
					.id(1234L)
					.motdepasse("belkadiouss2002")
					.role("etudiant")
					.build());
			List<utilisateur> utilisateurs = utilisateurRepository.findAll();
			utilisateurs.forEach(utilis -> {
				System.out.println(utilis.toString());
			});
		};
	}
}
