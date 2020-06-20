package org.itstack.demo.design;

import org.itstack.demo.design.agent.Select;

public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
