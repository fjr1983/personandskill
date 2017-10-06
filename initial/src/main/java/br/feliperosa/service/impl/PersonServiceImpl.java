package br.feliperosa.service.impl;
 
import java.util.List;
import java.util.Set;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import br.feliperosa.model.Person;
import br.feliperosa.model.Skill;
import br.feliperosa.repository.PersonRepository;
import br.feliperosa.service.PersonService;
 
@Service
public class PersonServiceImpl implements PersonService {
 
    @Autowired
    private PersonRepository personRepository;
 
    @Override
    public List<Person> findPersons() {
        List<Person> persons = personRepository.findAll();
        return persons;
    }
 
    @Override
    public Person findPersonById(long id) {
        return personRepository.findPersonById(id);
    }
 
    @Override
    public Set<Skill> findPersonSkillsById(long id) {
        return personRepository.findPersonById(id).getSkills();
    }
}