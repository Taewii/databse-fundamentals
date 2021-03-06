package app.services;

import app.domain.dto.PersonDto;
import app.domain.models.Person;

import java.util.List;

public interface PersonService {

    void create(Person person);

    void create(PersonDto personDto);

    Person findById(long id);

    PersonDto getPersonDtoFromId(long id);

    List<Person> findByCountry(String country);
}
