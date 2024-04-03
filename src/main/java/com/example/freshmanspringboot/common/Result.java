/**
 * 機能：
 * 作成者：kaise
 * 期日：2023/11/21 13:05
 */

package com.example.freshmanspringboot.common;

import lombok.*;
import org.apache.ibatis.annotations.Select;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result{

    public static final String CODE_SUCCESS = "200";
    public static final String CODE_AUTH_ERROR = "401";
    public static final String CODE_SYS_ERROR = "500";

    /**
     * 请求的返回编码 200 401 404 500
     * 编码表示这次请求是成功了还是失败了
     * 或者说 可以看出来失败的类型是什么
     */

    private String code;

    /**
     * msg表示错误的详细信息
     */

    private String msg;

    /**
     * 数据从什么地方返回出去？
     * 就是这个data
     * user Object类型就是User
     * list Object类型就是List
     * map Object类型就是Map
     */


    private Object data;

    public static Result success() {
        return new Result(CODE_SUCCESS, "请求成功", null);
    }

    public static Result success(Object data) {
        return new Result(CODE_SUCCESS, "请求成功", data);
    }

    public static Result error(String msg) {
        return new Result(CODE_SYS_ERROR,msg,null);
    }

    public static Result error(String code, String msg) {
        return new Result(CODE_SYS_ERROR, msg, null);
    }

    public static Result error(){
            return new Result(CODE_SYS_ERROR,"系统错误",null);
    }
}

/**
 * C
 */