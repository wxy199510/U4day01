package cn.kgc.demo.dao;

import cn.kgc.demo.pojo.History;

public interface HistoryMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(History record);

    int insertSelective(History record);

    History selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);

}