package com.company.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11431981", User.USERNAME.getValue(),
                    User.PASSWORD.getValue());
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
