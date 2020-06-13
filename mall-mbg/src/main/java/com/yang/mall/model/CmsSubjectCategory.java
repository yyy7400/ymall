package com.yang.mall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class CmsSubjectCategory implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "分类图标")
    private String icon;

    @ApiModelProperty(value = "专题数量")
    private Integer subjectCount;

    private Integer showStatus;

    private Integer sort;

    private static final long serialVersionUID = 1L;


}