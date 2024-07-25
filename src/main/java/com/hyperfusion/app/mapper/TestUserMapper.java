package com.hyperfusion.app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hyperfusion.app.entity.TestUserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestUserMapper extends BaseMapper<TestUserEntity> {
}
