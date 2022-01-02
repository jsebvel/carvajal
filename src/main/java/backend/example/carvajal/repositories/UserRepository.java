package backend.example.carvajal.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import backend.example.carvajal.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
}
