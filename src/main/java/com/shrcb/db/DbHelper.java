package com.shrcb.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author helen
 */
public class DbHelper {

    private Connection connection;

    public DbHelper()
    {
        setConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection()
    {
        try {
            if(connection==null ||  connection.isClosed()) {

                //读取db.properties文件
                InputStream inputStream= this.getClass().getResourceAsStream("/db.properties");
                Properties properties=new Properties();
                properties.load(inputStream);
                String driver=properties.getProperty("driver");
                String url=properties.getProperty("url");
                String uname=properties.getProperty("uname");
                String pwd=properties.getProperty("pwd");
                //1.加载驱动
                Class.forName(driver);
                //2.创建连接对象
                this.connection = DriverManager.getConnection(url, uname, pwd);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
