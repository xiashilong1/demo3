package com.baizhi;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo3ApplicationTests {

    @Autowired
    UserDAO userDAO;

    @Test
    public void selectAll() {
        List<User> users = userDAO.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void selectOne() {
        User user1 = new User();
        user1.setId(1);
        User user = userDAO.selectOne(user1);
        System.out.println(user);
    }
    @Test
    public void selectByPrimaryKey() {
        User user = userDAO.selectByPrimaryKey(1);
        System.out.println(user);
    }

    @Test
    public void insert() {
        User user = new User();
        //user.setAge(33);
        userDAO.insert(user);
        System.out.println(user.getId());
    }

    @Test
    public void deleteByPrimaryKey() {
        userDAO.deleteByPrimaryKey(1);

    }


    @Test
    public void updateByPrimaryKey() {
        User user = new User();
        user.setId(3);
        //user.setAge(20);
        userDAO.updateByPrimaryKey(user);
        System.out.println(user);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        User user = new User();
        user.setId(4);
        //user.setAge(34);
        userDAO.updateByPrimaryKeySelective(user);
    }


}
