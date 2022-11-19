package pers.koy.dao;

import org.apache.ibatis.annotations.Mapper;
import pers.koy.entity.Person;

import java.util.List;

@Mapper
public interface PersonDao {

    List<Person> getPerson();

    void addPerson(Person person);
}
