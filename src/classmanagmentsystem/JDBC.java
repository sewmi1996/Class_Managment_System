/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classmanagmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

    public static String URL = "jdbc:mysql://localhost:3306/classmanagement";
    public static String SEC = "?useSSL=true";
    public static String DRIVER = "com.mysql.jdbc.Driver";
    public static String USERNAME = "root";
    public static String PASSWORD = "";
    static Connection c;

    public static Connection con() throws Exception {
        if (c==null || c.isClosed()) {
            Class.forName(DRIVER);
            c = DriverManager.getConnection(URL+SEC, USERNAME, PASSWORD);
            return c;
        } else {
            return c;
        }
    }

    public boolean putData(String sql) {
        try {
            Statement st = JDBC.con().createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ResultSet getData(String sql) {
        try {
            Statement st = JDBC.con().createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean close(){
        try {
            if(!c.isClosed()){
                c.close();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
