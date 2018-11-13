package com.cncservice.controller;

import com.cncservice.entity.BaseConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baseconfigset")
public class BaseConfigController {

    public BaseConfig getBaseConfigs(){
        BaseConfig baseConfig = new BaseConfig();
        baseConfig.setName("gaolanyue");
        return baseConfig;
    }

}
