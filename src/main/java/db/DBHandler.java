package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBHandler {
    public static void connect(){
        Connection connection = null;
        Statement statement = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("", "postgres", "");
        } catch (Exception e) {
        }
    }
}
