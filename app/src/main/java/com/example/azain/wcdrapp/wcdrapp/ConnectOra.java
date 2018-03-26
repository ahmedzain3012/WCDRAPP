package com.example.azain.wcdrapp.wcdrapp;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import android.util.Log;

/**
 * Created by ahmedel-absaway on 27/03/2018.
 */

public class ConnectOra {
    private Connection conn;
    private Statement stmt;
    public ConnectOra() throws ClassNotFoundException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@10.10.0.72:1523:wtndbrx";
            this.conn = DriverManager.getConnection(url,"dist","newdist");
            this.conn.setAutoCommit(false);
            this.stmt = this.conn.createStatement();
        } catch(SQLException e) {
            Log.d("tag", e.getMessage());
        }
    }
    public ResultSet getResult() throws SQLException {
        ResultSet rset = stmt.executeQuery("select name from customer where rownum < 10");
        stmt.close();
        return rset;
    }
}
