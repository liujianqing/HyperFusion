package com.hyperfusion.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyperfusion.app.entity.TestUserEntity;
import com.hyperfusion.app.mapper.TestUserMapper;
import com.hyperfusion.app.service.TestUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUserEntity> implements TestUserService {

}
