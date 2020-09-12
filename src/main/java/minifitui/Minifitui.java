package main.java.minifitui;

import minifi.tui.framework.TApplication;

import java.io.UnsupportedEncodingException;

public class Minifitui {

    public static void main(String[] args) {
        TApplication app = null;
        try {
            app = new TApplication(TApplication.BackendType.XTERM);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        app.addToolMenu();
        app.addFileMenu();
        app.addWindowMenu();
        app.run();
    }
}