package com.yang.mall.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class CmsPrefrenceAreaProductRelation implements Serializable {
    private Long id;

    private Long prefrenceAreaId;

    private Long productId;

    private static final long serialVersionUID = 1L;


}