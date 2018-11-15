package com.cncservice.dao;

import com.cncservice.entity.BaseConfig;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface BaseConfigDao {

    List<BaseConfig> getBaseConfigList(String ssoid);

    int insertBaseConfig(@Param("kv") Map<String,String> kv,  @Param("baseConfig") BaseConfig baseConfig);

    List<BaseConfig> updateBaseConfig(Map<String,String> BaseconfigMap);

    int delete (BaseConfig record);


}
