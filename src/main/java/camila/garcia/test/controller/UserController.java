package camila.garcia.test.controller;

import camila.garcia.test.dao.UserDao;
import camila.garcia.test.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/users")
    @ResponseBody
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = (List<User>) userDao.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }


}
