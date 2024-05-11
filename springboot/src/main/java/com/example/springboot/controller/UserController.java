package com.example.springboot.controller;


import com.example.springboot.pojo.Result;
import com.example.springboot.pojo.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
/*@Controller*/
public class UserController {
    @Autowired
    private UserService userService;

   /*
   @PostMapping("/save")
   @ResponseBody注解表示方法的返回值应该直接写入 HTTP 响应体中，而不是被解析为视图。
    它告诉 Spring MVC 框架将方法的返回值序列化为特定格式（如 JSON、XML 等）
    作为响应的主体内容返回给客户端。
    public Result save(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }*/

    /**
     * 增加
     * @param user
     * @return
     */
    @PostMapping("/save")
    public Result save(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }

    /**
     * 删除操作
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        userService.delete(id);
        return Result.success();
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @PutMapping("/update")
    public Result update(@RequestBody User user) {
        userService.update(user);
        return Result.success();
    }
    /**
     * 查询1
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        User user = userService.getById(id);
        return user != null?Result.success(user):Result.error("没有找到该用户");
    }
    /**
     * 查询所有
     */
    @GetMapping("/user")
    public Result list(){
        List<User> UserList = userService.list();
        return Result.success(UserList);
    }
}
