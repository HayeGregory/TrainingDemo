package be.bstorm.gha.TrainingDemo.repositories;

import be.bstorm.gha.TrainingDemo.models.entities.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface QuestionRepository extends CrudRepository<Question, Long> {
}
