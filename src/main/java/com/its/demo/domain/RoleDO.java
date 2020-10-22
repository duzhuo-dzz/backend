package com.its.demo.domain;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import jdk.nashorn.internal.ir.annotations.Ignore;
import jdk.nashorn.internal.objects.annotations.Property;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色实体类
 *
 * @author 杨金刚
 * @date 2020/4/20 14:06
 */
@Data
public class RoleDO implements Serializable {
    /**
     * 主键
     */
    @ExcelIgnore
    private Long id;
    /**
     * 角色
     */
    @ExcelProperty("角色")
    private String role;
    /**
     * 角色汉字描述
     */
    @ExcelIgnore
    private String description;
    /**
     * 记录创建时间
     */
    @ExcelProperty
    private Date gmtCreate;
    /**
     * 记录修改时间
     */
    @ExcelProperty
    private Date gmtModified;
}
