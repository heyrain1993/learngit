package com.hicetech.ucenter.dao;

import com.hicetech.ucenter.model.JPushPo;
import com.hicetech.ucenter.model.JPushPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JPushPoMapper {
    int countByExample(JPushPoExample example);

    int deleteByExample(JPushPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JPushPo record);

    int insertSelective(JPushPo record);

    List<JPushPo> selectByExample(JPushPoExample example);

    JPushPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JPushPo record, @Param("example") JPushPoExample example);

    int updateByExample(@Param("record") JPushPo record, @Param("example") JPushPoExample example);

    int updateByPrimaryKeySelective(JPushPo record);

    int updateByPrimaryKey(JPushPo record);
}