package com.hicetech.ucenter.dao;

import com.hicetech.ucenter.model.UserPo;
import com.hicetech.ucenter.model.UserPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPoMapper {
    int countByExample(UserPoExample example);

    int deleteByExample(UserPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPo record);

    int insertSelective(UserPo record);

    List<UserPo> selectByExample(UserPoExample example);

    UserPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserPo record, @Param("example") UserPoExample example);

    int updateByExample(@Param("record") UserPo record, @Param("example") UserPoExample example);

    int updateByPrimaryKeySelective(UserPo record);

    int updateByPrimaryKey(UserPo record);
}