package br.feliperosa.service;
 
import java.util.List;
import java.util.Set;
 
import br.feliperosa.model.Person;
import br.feliperosa.model.Skill;
 
public interface PersonService {
 
    List<Person> findPersons();
    Person findPersonById(long id);
    Set<Skill> findPersonSkillsById(long id);
 
}