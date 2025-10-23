package org.embed.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.embed.domain.UserDto;
//import java.util.List;

@Mapper
public interface UserMapper {
	void insertUser(UserDto user);
	UserDto findById(int id);
	UserDto findByUsername(String username);
	List<UserDto> findAll();

}
