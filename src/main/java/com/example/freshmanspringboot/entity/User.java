/**
 * 機能：
 * 作成者：kaise
 * 期日：2023/11/28 14:03
 */

package com.example.freshmanspringboot.entity;

import lombok.Data;

@Data
public class User {
    private Integer member_id;

    private String username;
    private String last_name;
    private String first_name;
    private String sei;
    private String mei;
    private String birthdate;
    private String gender;
    private String email;
    private String password;
    private String postal_code;
    private String phone_number;
    private String prefecture;
    private String address;
    private String building_name;
}


