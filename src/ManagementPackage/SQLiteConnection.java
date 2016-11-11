/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagementPackage;

/**
 *
 * @author KD
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLiteConnection {
    public static Connection connectorDB() {//Create a connection method
        try {//try catch statement for exception handling
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:shop_management_system.sqlite");//connection established!!!
            //JOptionPane.showMessageDialog(null, "Connection Established!");
            return con;
        } catch (Exception e) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}
