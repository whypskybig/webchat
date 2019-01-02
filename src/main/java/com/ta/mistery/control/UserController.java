package com.ta.mistery.control;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ta.mistery.entity.User;
import com.ta.mistery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class UserController {
//    @Autowired
//    private UserRepository userRepository;
//
//
//    //查看全部
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public void sau(HttpServletResponse response) throws IOException {
//
//        List<User> list = userRepository.findAll();
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        for (User p : list)
//            map.put(p.getId(), p.getName());
//        ObjectMapper json = new ObjectMapper();
//        String ss = json.writeValueAsString(map);
//        PrintWriter out = response.getWriter();
//        out.print(ss);
//        out.flush();
//        out.close();
//    }
//
//    //添加一个
//    @PostMapping(value = "/hello")
//    public User addPerson(@RequestParam("id") Integer id, @RequestParam("name") String name) {
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        return userRepository.save(user);
//    }
//
//    @GetMapping(value = "/hello/add")
//    public User addPerson1(@RequestParam("id") Integer id, @RequestParam("name") String name) {
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        return userRepository.save(user);
//    }
//
//
//    //修改一个
//    @PutMapping(value = "/hello/{id}")
//    public User updatePerson(@PathVariable("id") Integer id, @RequestParam("name") String name) {
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        return userRepository.save(user);
//    }
//
//    @GetMapping(value = "/hello/upd")
//    public User updPerson(@RequestParam("id") Integer id, @RequestParam("name") String name) {//@PathVariable("id") Integer id){
//        User user = findOne(id);
//        user.setName(name);
//        return userRepository.save(user);
//    }
//
//    //查找一个
//    @GetMapping(value = "/hello/{id}")
//    public User findOne(@PathVariable("id") Integer id) {
//        return userRepository.findById(id).orElse(null);
//    }
//
//    //删除
//    @GetMapping(value = "/hello/del/{id}")
//    public void deletePerson(@PathVariable("id") Integer id) {
//        User user = findOne(id);
//        userRepository.delete(user);
//    }

}
