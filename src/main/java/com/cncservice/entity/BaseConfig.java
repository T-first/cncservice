package com.cncservice.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public class BaseConfig {
    private Integer id;
    private String fieldName;
    private String fieldValue;
    private String orgHierarchyCode;
    private String hierarchyCode;
    private String ssoid;
    private  int status;
    //@TableField(exist = false)
    private Map<String,String> kv;

    public Map<String, String> getKv() {
        return kv;
    }

    public void setKv(Map<String, String> kv) {
        this.kv = kv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String key) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getOrgHierarchyCode() {
        return orgHierarchyCode;
    }

    public void setOrgHierarchyCode(String orgHierarchyCode) {
        this.orgHierarchyCode = orgHierarchyCode;
    }

    public String getHierarchyCode() {
        return hierarchyCode;
    }

    public void setHierarchyCode(String hierarchyCode) {
        this.hierarchyCode = hierarchyCode;
    }

    public String getSsoid() {
        return ssoid;
    }

    public void setSsoid(String ssoid) {
        this.ssoid = ssoid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
