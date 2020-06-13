package com.yang.mall.common.api;

/**
 * 封装API的错误码
 * @author yangyuyang
 * @date 2020/6/13 22:43
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
