package br.feliperosa.model;
 
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.*;
 
import com.fasterxml.jackson.annotation.JsonBackReference;
 
@Entity
@Table(name="skill")
public class Skill implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    public Skill() {
        super();
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private Long id;
 
    @Column(name = "skill_tag")
    private String skillTag;
 
    @Column(name = "skill_description")
    private String skillDescription;
 
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "skills")
    @JsonBackReference
    private Set<Person> persons = new HashSet<Person>(0);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillTag() {
		return skillTag;
	}

	public void setSkillTag(String skillTag) {
		this.skillTag = skillTag;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
 
       
    
 
}