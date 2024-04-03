/**
 * 機能：
 * 作成者：kaise
 * 期日：2024/01/18 14:02
 */

package com.example.freshmanspringboot.exception;

import lombok.Getter;

@Getter
public class ServiceException extends RuntimeException{

    private String code;

    public ServiceException(String msg){
        super(msg);
        this.code = "500";
    }

    public ServiceException(String code, String msg){
        super(msg);
        this.code = code;
    }
}
