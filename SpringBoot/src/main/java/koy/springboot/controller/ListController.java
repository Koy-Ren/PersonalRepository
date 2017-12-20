package koy.springboot.controller;

import io.swagger.annotations.ApiOperation;
import koy.springboot.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ListController {

    final static Logger LOGGER = LoggerFactory.getLogger(ListController.class);

    @ApiOperation(value = "测试swagger ui")
    @RequestMapping(value = "/testList", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Integer>> testList(HttpServletRequest request, Person human, String name) {
        Map<String, Object> resultMap = new HashMap<>();
        List<Map<String, Integer>> list = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> map3 = new HashMap<>();
        map1.put("type", 1);
        map1.put("count", 3);
        map2.put("type", 2);
        map2.put("count", 4);
        map3.put("type", 3);
        map3.put("count", 2);
        list.add(map1);
        list.add(map2);
        list.add(map3);
        resultMap.put("list", list);

        return list;
        //return resultMap;
    }
}
