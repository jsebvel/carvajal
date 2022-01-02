package backend.example.carvajal.repositories;

import org.springframework.data.repository.CrudRepository;

import backend.example.carvajal.models.Card;

public interface CardRepository extends CrudRepository <Card, Integer> {
    
}
