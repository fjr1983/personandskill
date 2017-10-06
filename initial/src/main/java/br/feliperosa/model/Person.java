package br.feliperosa.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "linkedin_url")
	private String linkedinUrl;

	@Column(name = "whatsapp")
	private int whatsApp;

	@Column(name = "mail")
	private String mail;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "person_skill", joinColumns = {
			@JoinColumn(name = "person_id", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "skill_id",
					nullable = false, updatable = false) })
	@JsonManagedReference
	private Set<Skill> skills = new HashSet<Skill>(0);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public int getWhatsApp() {
		return whatsApp;
	}

	public void setWhatsApp(int whatsApp) {
		this.whatsApp = whatsApp;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Set<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}

   
	
	
}