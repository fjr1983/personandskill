create table person (
    person_id int auto_increment not null,
    first_name varchar(20) not null,
    last_name varchar(50) not null,
    linkedin_url varchar(80) null,
    whatsapp bigint null,
    mail varchar(80) not null,
    primary key (person_id)
);
 
create table skill (
    skill_id int auto_increment not null,
    skill_tag varchar(100) not null,
    skill_description varchar(200) not null,
    primary key (skill_id)
);
 
create table person_skill (
    skill_id int  not null,
    person_id int not null,
    FOREIGN KEY (skill_id) REFERENCES skill(skill_id),
    FOREIGN KEY (person_id) REFERENCES person(person_id)
);