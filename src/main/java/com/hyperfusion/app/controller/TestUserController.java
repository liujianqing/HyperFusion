package com.hyperfusion.app.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hyperfusion.app.common.result.Result;
import com.hyperfusion.app.entity.TestUserEntity;
import com.hyperfusion.app.service.TestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@Api(tags = "用于测试的用户模块", value = "测试用户controller")
public class TestUserController {

    @Autowired
    private TestUserService testUserService;


    @ApiOperation("新增用户")
    @PostMapping("save")
    public Result save(@RequestBody TestUserEntity user) {
        testUserService.save(user);
        return Result.success(user);
    }

    @ApiOperation("删除⽤户")
    @DeleteMapping("delete/{id}")
    public Result deleteById(@PathVariable("id") Integer id) {
        testUserService.removeById(id);
        return Result.success(id);
    }

    @ApiOperation("修改用户")
    @PutMapping("update")
    public Result update(@RequestBody TestUserEntity user) {
        testUserService.updateById(user);
        return Result.success(user);
    }

    @ApiOperation("用户列表")
    @GetMapping("list")
    public Result list() {
//        TestUserEntity user1 = TestUserEntity.builder().id(1).name("aaa").age(22).phone("111111").mail("aaa@qq.com").build();
//        TestUserEntity user2 = TestUserEntity.builder().id(2).name("bbb").age(33).phone("222222").mail("bbb@qq.com").build();
//        List<TestUserEntity> list = new ArrayList<>();
//        list.add(user1);
//        list.add(user2);
//        testUserService.saveBatch(list);

        List<TestUserEntity> userList = testUserService.list();
        return Result.success(userList);
    }

    @ApiOperation("查看用户详情")
    @GetMapping("detail")
    public Result query(@ApiParam(name = "id", value = "用户id", example = "1") @RequestParam("id") int id) {
        TestUserEntity user = testUserService.getOne(new LambdaQueryWrapper<TestUserEntity>().eq(TestUserEntity::getId, id));
        return Result.success(user);
    }
}
