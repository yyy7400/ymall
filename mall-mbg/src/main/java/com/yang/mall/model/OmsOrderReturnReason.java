package com.yang.mall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class OmsOrderReturnReason implements Serializable {
    private Long id;

    @ApiModelProperty(value = "退货类型")
    private String name;

    private Integer sort;

    @ApiModelProperty(value = "状态：0->不启用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "添加时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;


}