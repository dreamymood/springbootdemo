package com.she.springbootdemo.repository;

import com.she.springbootdemo.bean.AppState;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AppStateRepository {
    @Select("select * from tb_app_change where id = 1")
//    @ResultMap("appResult")
    @Results(id = "appResult", value = {
            @Result(id=true,column = "id", property = "id"),
            @Result(column = "open", property = "open"),
    })
    public AppState selectAppChange();

    @Update("update tb_app_change set open=#{open} where id=1")
    public void update(final AppState user);
}
