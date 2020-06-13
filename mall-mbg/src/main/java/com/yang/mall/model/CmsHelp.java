package com.yang.mall.model;

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
public class CmsHelp implements Serializable {
    private Long id;

    private Long categoryId;

    private String icon;

    private String title;

    private Integer showStatus;

    private Date createTime;

    private Integer readCount;

    private String content;

    private static final long serialVersionUID = 1L;

}