package com.mars.backend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回对象
 *
 * @author mars
 */
@Data
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = -4845404832176610908L;

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }

}
