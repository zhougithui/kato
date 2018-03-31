package com.jsdx.kato.mapper;

import com.jsdx.kato.domain.TestEntity;
import com.jsdx.kato.domain.TestEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestEntityMapper {
    long countByExample(TestEntityExample example);

    int deleteByExample(TestEntityExample example);

    int insert(TestEntity record);

    int insertSelective(TestEntity record);

    List<TestEntity> selectByExample(TestEntityExample example);

    int updateByExampleSelective(@Param("record") TestEntity record, @Param("example") TestEntityExample example);

    int updateByExample(@Param("record") TestEntity record, @Param("example") TestEntityExample example);
}