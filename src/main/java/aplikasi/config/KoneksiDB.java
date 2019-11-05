/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.config;

import java.sql.Connection;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author dimmaryanto
 */
public class KoneksiDB {

    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUsername("root");
        ds.setPassword("hacked17.");
        ds.setUrl("jdbc:mysql://localhost:3306/dbaset");
        ds.setDriverClassName("org.mariadb.jdbc.Driver");
        return ds;
    }
}
