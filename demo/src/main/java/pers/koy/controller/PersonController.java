package pers.koy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.koy.entity.Person;
import pers.koy.service.PersonService;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/person")
public class PersonController {

    @Resource
    PersonService personService;

    @PostMapping("/addPerson")
    public String addPerson() {

        String result = personService.addPerson();

        log.info(result);

        return "add successful";
    }

    @GetMapping("/getPerson")
    public List<Person> getPerson() {

        return personService.getPerson();
    }

}
