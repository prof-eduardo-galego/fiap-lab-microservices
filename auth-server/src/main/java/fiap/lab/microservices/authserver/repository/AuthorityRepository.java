package fiap.lab.microservices.authserver.repository;

import fiap.lab.microservices.authserver.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Authority findByName(String name);

}