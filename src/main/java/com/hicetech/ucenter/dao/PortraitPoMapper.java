package com.hicetech.ucenter.dao;

import com.hicetech.ucenter.model.PortraitPo;
import com.hicetech.ucenter.model.PortraitPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PortraitPoMapper {
    int countByExample(PortraitPoExample example);

    int deleteByExample(PortraitPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PortraitPo record);

    int insertSelective(PortraitPo record);

    List<PortraitPo> selectByExample(PortraitPoExample example);

    PortraitPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PortraitPo record, @Param("example") PortraitPoExample example);

    int updateByExample(@Param("record") PortraitPo record, @Param("example") PortraitPoExample example);

    int updateByPrimaryKeySelective(PortraitPo record);

    int updateByPrimaryKey(PortraitPo record);
    
    PortraitPo selectRandom();
}