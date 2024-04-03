package com.example.freshmanspringboot.mapper;

import com.example.freshmanspringboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO `memberregistration_ka1`.memberregistration(" +
            "username, last_name, first_name, sei, mei, birthdate, gender, email, password, " +
            "postal_code, phone_number, prefecture, address, building_name) " +
            "VALUES (#{username}, #{last_name}, #{first_name}, #{sei}, #{mei}, #{birthdate}, " +
            "#{gender}, #{email}, #{password}, #{postal_code}, #{phone_number}, #{prefecture}, " +
            "#{address}, #{building_name})")
    void insert(User user);


    @Update("UPDATE `memberregistration_ka1`.memberregistration SET " +
            "username=#{username}, last_name=#{last_name}, first_name=#{first_name}, " +
            "sei=#{sei}, mei=#{mei}, birthdate=#{birthdate}, gender=#{gender}, email=#{email}, " +
            "password=#{password}, postal_code=#{postal_code}, phone_number=#{phone_number}, " +
            "prefecture=#{prefecture}, address=#{address}, building_name=#{building_name} " +
            "WHERE member_id=#{member_id}")
    void update(User user);

    @Delete("delete from management12.user where id = #{id}")
    void deleteUser(Integer id);

    @Select("select * from management12.user")
        //排序查询：("select * from management12.user order by id desc")
    List<User> selectAll();

    @Select("select * from management12.user where id = #{id} order by id desc")
    User selectById(Integer id);

    @Select("select * from memberregistration_ka1.memberregistration where username = #{id} order by member_id desc")
    User selectByUsername(String username);
}


