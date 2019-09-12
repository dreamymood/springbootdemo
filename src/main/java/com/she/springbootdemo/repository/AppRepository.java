package com.she.springbootdemo.repository;

import com.she.springbootdemo.bean.App;
import com.she.springbootdemo.bean.AppState;
import org.apache.ibatis.annotations.*;

public interface AppRepository {
    @Insert("insert into tb_app_state(link_url)" + "values (#{linkUrl})")
    public int insertApp(App app);

    @Select("select * from tb_app_state where id = (select max(id) from tb_app_state)")
//    @ResultMap("appResult")
    @Results(id = "appResult", value = {
            @Result(id=true,column = "id", property = "id"),
            @Result(column = "link_url", property = "linkUrl"),
    })
    public App selectByMaxId();
}
