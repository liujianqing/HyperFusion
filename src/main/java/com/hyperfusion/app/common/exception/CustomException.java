package com.hyperfusion.app.common.exception;

import java.io.Serial;

/**
 * 业务异常
 *
 * @author ljq
 */
public final class CustomException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误提示
     */
    private String message;

    /**
     * 错误明细，内部调试错误
     */
    private String detailMessage;

    /**
     * 空构造方法，避免反序列化问题
     */
    public CustomException() {
    }

    public CustomException(String message) {
        this.message = message;
    }

    public CustomException(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public CustomException setMessage(String message) {
        this.message = message;
        return this;
    }

    public CustomException setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
        return this;
    }
}