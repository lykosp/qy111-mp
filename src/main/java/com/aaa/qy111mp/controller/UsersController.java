package com.aaa.qy111mp.controller;


import com.aaa.qy111mp.entity.LayUiTable;
import com.aaa.qy111mp.entity.Users;
import com.aaa.qy111mp.service.UsersService;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-11
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/selectUsers")
    @ResponseBody
    public LayUiTable selectUsers(Integer page,Integer limit){
        LayUiTable table=new LayUiTable();
        // 返回所有条数
        //int usersListCount=usersService.selectList(null).size();
        int usersListCount=usersService.selectCount(null);
        // 分页
        Page<Users> usersPage = new Page(page,limit);
        Page<Users> usersPagep =usersService.selectPage(usersPage);
        List<Users> usersList=usersPagep.getRecords();
        table.setCode(0);
        table.setMsg("操作成功");
        table.setData(usersList);
        table.setCount(usersListCount);
        return table;
    }

    @RequestMapping("/saveUser")
    @ResponseBody
    public Object saveUser(Users users){
        Map<String ,Object > map = new HashMap<>();
        boolean insert = usersService.insert(users);
        if(insert){
            map.put("code",0);
            map.put("msg","保存成功");
        }else {
            map.put("code",1);
            map.put("msg","保存失败");
        }
        return map;
    }
}

