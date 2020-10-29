package org.itstack.demo.design;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtil {

    private static Logger logger = LoggerFactory.getLogger(JDBCUtil.class);

    public static final String URL = "jdbc:mysql://127.0.0.1:3306/itstack_demo_ddd";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT id, name, age, createTime, updateTime FROM user");
        //如果有数据，rs.next()返回true
        while (resultSet.next()) {
            logger.info("测试结果 姓名：{} 年龄：{}", resultSet.getString("name"),resultSet.getInt("age"));
        }
    }

}
