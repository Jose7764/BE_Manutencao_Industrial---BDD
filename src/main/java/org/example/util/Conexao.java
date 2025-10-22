package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static String URL = "jdbc:mysql://localhost:3306/Sistema_Manutencao";
    private static String USER = "root";
    private static String PASSWORD = "mysqlPW";


    public static Connection Conectar () throws SQLException{

        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
