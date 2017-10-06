This rest API with spring-boot, spring-data and H2 database.
This rest API performs the following read operations:
a) Get all persons including relationships (skill)
b) Get an specific person including relationships using person_id as parameter
c) Get set of skill for specific person_id



to compile and run the application with an example for each call do:

mvn package && mvn spring-boot:run

a) Get all persons excluding relationships (skill) http://localhost:8080/persons

b) Get an specific person including relationships using person_id as parameter http://localhost:8080/persons/1

c) Get set of skill for specific person_id http://localhost:8080/persons/1/skills
