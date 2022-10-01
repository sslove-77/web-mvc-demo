package com.shrcb.servlet.dao;

import com.shrcb.db.DbHelper;
import com.shrcb.servlet.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImp implements UserDao{

    /**
     *  创建数据库连接对象
     */

    private Connection connection = new DbHelper().getConnection();

    /**
     *
     * @return get user list
     */
    public List<User> queryUser() {

//        创建集合存储对象
        List<User> users = new ArrayList<User>();

//        创建命令对象
        try {
//            预处理sql
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Users");
//            执行sql查询
            ResultSet resultSet = preparedStatement.executeQuery();
//            结果处理
            while (resultSet.next()) {
//                解析每条记录
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

//              设置对象值
                User user = new User();
                user.setId(id);
                user.setName(name);
                user.setAge(age);

//                将对象写入集合
                users.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}
