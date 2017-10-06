package br.feliperosa.controller;
 
import java.util.List;
import java.util.Set;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import br.feliperosa.model.Person;
import br.feliperosa.model.Skill;
import br.feliperosa.service.PersonService;
 
@RestController
public class PersonController {
 
    @Autowired
    private PersonService personService;
 
    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> getPersons() {
        List<Person> persons = personService.findPersons();
        if (persons.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Person>>(persons, HttpStatus.OK);
    }
 
    @RequestMapping(value = "/persons/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> getPersonById(@PathVariable("id") Integer id) {
 
        Person person = personService.findPersonById(id);
        if (person == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }
 
    @RequestMapping(value = "/persons/{id}/skills", method = RequestMethod.GET)
    public ResponseEntity<Set<Skill>> getPersonSkillsById(@PathVariable("id") Integer id) {
 
        Set<Skill> skills = personService.findPersonSkillsById(id);
        if (skills.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Set<Skill>>(skills, HttpStatus.OK);
    }
 
}