package pers.koy.service;

import org.springframework.stereotype.Service;
import org.sqlite.date.DateFormatUtils;
import pers.koy.dao.PersonDao;
import pers.koy.entity.Person;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PersonService {

    @Resource
    PersonDao personDao;

    public String addPerson() {

        Person person = new Person();

        person.setName("任柯宇");
        person.setAlias("koy");
        person.setCreateTime(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
        person.setBackup("添加用户测试");

        personDao.addPerson(person);

        return "succ";
    }

    public List<Person> getPerson() {

        return personDao.getPerson();
    }

}
