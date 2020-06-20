package com.aaa.qy111mp;

import com.aaa.qy111mp.entity.Users;
import com.aaa.qy111mp.service.UsersService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Qy111MpApplicationTests {
    @Autowired
    private UsersService usersService;

    @Test
    void saveUsers() {
        Users users=new Users();
        users.setName("张三");
        users.setEmail("1211@qq.com");
        users.setPassword("2");
        users.setRole(0);
        usersService.insert(users);
    }
    @Test
    void deleteUsers() {
        //按照条件删除
        /*Wrapper<Users> wrapper = new EntityWrapper<>();
        wrapper.eq("name","张三");
        usersService.delete(wrapper);*/
        //按照主键批量删除
        /*List<Integer> ids = new ArrayList<>();
        ids.add(55);
        ids.add(58);
       usersService.deleteBatchIds(ids);*/
        //按照主键单个删除
        usersService.deleteById(59);
    }

    @Test
    void updateUsers() {
        Users users=new Users();
        users.setUid(60);
        users.setName("李四");
        users.setEmail("121@qq.com");
        users.setPassword("2");
        users.setRole(0);
        usersService.updateById(users);
    }
    //排序
    @Test
    void orderUsers() {
        Wrapper<Users> wrapper = new EntityWrapper<>();
        wrapper.orderBy("uid",false);
        List<Users> usersList=usersService.selectList(wrapper);
        for (Users users:usersList){
            System.out.println(users.toString());
        }
    }
    //模糊查询
    @Test
    void likeUsers() {
        Wrapper<Users> wrapper = new EntityWrapper<>();
        wrapper.like("name","刘");
        List<Users> usersList=usersService.selectList(wrapper);
        for (Users users:usersList){
            System.out.println(users.toString());
        }
    }
    //分页
    @Test
    void pageUsers() {

        Page<Users> page = new Page(1,5);
        Page<Users> usersPagep =usersService.selectPage(page);
        List<Users> usersList=usersPagep.getRecords();
        for (Users users:usersList){
            System.out.println(users.toString());
        }
    }
}
