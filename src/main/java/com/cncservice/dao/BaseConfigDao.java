package com.cncservice.dao;

import com.cncservice.entity.BaseConfig;

public interface BaseConfigDao {

    int deleteByPrimaryKey(Integer id);

    int insert(BaseConfig record);

    int insertSelective(BaseConfig record);

    BaseConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseConfig record);

    int updateByPrimaryKey(BaseConfig record);


}
