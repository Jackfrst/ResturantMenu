package com.qestion2;

import javax.swing.*;
import java.security.KeyStore;

public class Main {
    public static void runapp(int a)
    {
        app obj = new app();
        obj.setContentPane(new app().mainbody);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setTitle("Restaurant Menu ");
        obj.pack();
        obj.setVisible(true);
    }


    public static void main(String[] args) {
        runapp(0);
    }

}
