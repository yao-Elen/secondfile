package com.iflytek.test;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) throws Exception {
       //selectTest();
       //updateTest();
        //prepareTest1();
        prepareTest2();
    }

    public static void selectTest() throws Exception {
        //加载JDBC驱动程序
        Class.forName("com.mysql.jdbc.Driver");
//建⽴立数据库连接Connection
        String username = "root";
        String password = "123456";
        String url = "jdbc:mysql://127.0.0.1:3306/news?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false";
        Connection connection = DriverManager.getConnection(url, username, password);
//创建执⾏行行SQL的语句句Statement
        Statement statement = connection.createStatement();
//处理理执⾏行行结果ResultSet
        ResultSet resultSet = statement.executeQuery("select * from user");
        while (resultSet.next()) {
            System.out.println("学号:" + resultSet.getInt("id") + "姓名:" +
                    resultSet.getString("name")+ "性别:" + resultSet.getInt("sex")+"民族:"+resultSet.getString("nature"));
        }
//释放连接资源
        resultSet.close();
        statement.close();
        connection.close();
    }

    public static void updateTest() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String username = "root";
        String password = "123456";
        String url = "jdbc:mysql://127.0.0.1:3306/news?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false";
        Connection connection = DriverManager.getConnection(url, username, password);
//创建执⾏行行SQL的语句句Statement
        Statement statement = connection.createStatement();
//处理理执⾏行行结果ResultSet
       // statement.executeUpdate("insert into user(id,name,sex,nature) values(3,'古力娜扎',2,'维吾尔族')");
       // statement.executeUpdate("delete  from user where id=3");
        statement.executeUpdate("update user set name='李宁' where id=2");
//释放连接资源
        statement.close();
        connection.close();
    }

    public static void prepareTest1() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String username = "root";
        String password = "123456";
        String url = "jdbc:mysql://127.0.0.1:3306/news?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement preparedStatement = connection.prepareStatement("insert into user(id,name,age,sex,nature) values(?,?,?,?,?) ");
        preparedStatement.setInt(1, 4);
        preparedStatement.setString(2, "黎姿");
        preparedStatement.setInt(3, 16);
        preparedStatement.setInt(4, 1);
        preparedStatement.setString(5, "回族");
//执行
        preparedStatement.execute();
        preparedStatement.close();
        connection.close();
    }

    public static void prepareTest2() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String username = "root";
        String password = "123456";
        String url = "jdbc:mysql://127.0.0.1:3306/news?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user where name='zhangsan' or 1=1");

//        PreparedStatement preparedStatement = connection.prepareStatement("select * from stu  where name=?");
//        preparedStatement.setString(1,"tuyouyou or 1=1");
////执行
//        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("学号:" + resultSet.getInt("id") + "姓名:" +
                    resultSet.getString("name")+ "性别:" + resultSet.getInt("sex")+"民族:"+resultSet.getString("nature"));
        }
//        preparedStatement.close();
        statement.close();
        resultSet.close();
        connection.close();
    }

}
