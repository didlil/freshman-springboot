/**
 * 機能：
 * 作成者：kaise
 * 期日：2024/01/17 17:42
 */

package com.example.freshmanspringboot.exception;

import com.example.freshmanspringboot.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result serviceException(ServiceException e){
        e.printStackTrace();
        return Result.error(e.getCode(),e.getMessage());
    }
}
