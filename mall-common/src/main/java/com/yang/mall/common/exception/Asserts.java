package com.yang.mall.common.exception;

import com.yang.mall.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * @author yangyuyang
 * @date 2020/6/13 22:43
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
