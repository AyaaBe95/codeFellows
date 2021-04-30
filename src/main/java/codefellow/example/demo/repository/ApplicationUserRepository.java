package codefellow.example.demo.repository;

import codefellow.example.demo.model.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Integer> {
    public ApplicationUser findByUsername(String userName);
}
