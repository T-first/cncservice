package com.cncservice.controller;

import com.cncservice.dao.BaseConfigDao;
import com.cncservice.entity.BaseConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/baseconfigset")
public class BaseConfigController {
    @Autowired
    private BaseConfigDao baseConfigDao;
    @RequestMapping("/getlist")
    public List<BaseConfig> getBaseConfigs(){

        BaseConfig baseConfig = new BaseConfig();
        baseConfig.setHierarchyCode("YES");
        baseConfig.setOrgHierarchyCode("NO");
        baseConfig.setSsoid("qwq");
        baseConfig.setStatus(1);
        Map<String,String> kv =  new HashMap<String,String>();
        kv.put("color","yellow");
        kv.put("test","test");
        baseConfigDao.insertBaseConfig( kv,baseConfig);
        return  (List<BaseConfig>)baseConfigDao.getBaseConfigList("qwq");
    }

}
