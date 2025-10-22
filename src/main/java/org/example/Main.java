package org.example;

import org.example.view.View;
import org.example.service.funtions;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        View view = new View();
        funtions menu = new funtions();

        while(true){
            int opcaoMenu = view.Menu();
            menu.tratadorMenu(opcaoMenu);

            if (opcaoMenu == 0){
                break;
            }


        }


    }
}