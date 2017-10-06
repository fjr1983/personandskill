package br.feliperosa.repository;
 
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.feliperosa.model.Person;
 
public interface PersonRepository extends CrudRepository<Person, Long> {
 
    List<Person> findAll();
    Person findPersonById(long id);
 
}