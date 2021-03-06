package com.kzl.rm.dao;

import com.kzl.rm.bean.User;
import com.kzl.rm.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Long userId);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Long userId);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	long findUserByAccountAndPassword(@Param("userAccount") String account, @Param("password") String password);

	User findUserByAccount(@Param("userAccount") String account);

	int updateImageId(@Param("userAccount") String userAccount, @Param("personalImageId") Long personalImageId);

	int update_userInfo(@Param("userName") String userName, @Param("position") String position,
			@Param("email") String email, @Param("telephone") String telephone, @Param("userAccount") String userAccount);

	int update_password( @Param("userAccount") String userAccount, @Param("password")  String password);
}