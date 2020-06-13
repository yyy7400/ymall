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
public class CmsSubjectComment implements Serializable {
    private Long id;

    private Long subjectId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private Date createTime;

    private Integer showStatus;

    private static final long serialVersionUID = 1L;


}