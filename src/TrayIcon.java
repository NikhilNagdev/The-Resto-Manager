/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */

import constants.MyConstants;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon.MessageType;
import java.net.MalformedURLException;

public class TrayIcon {

    /*
    Test Code to check tray icon
    public static void main(String[] args) throws AWTException, MalformedURLException {
        if (SystemTray.isSupported()) {
            TrayIcon td = new TrayIcon();
            td.displayTray(null, 0);
        } else {
            System.err.println("System tray not supported!");
        }
    }
    */

    public void displayTray(String foodName, int tableNo) throws AWTException, MalformedURLException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = MyConstants.TRAYICON.getImage();
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getToolkit().createImage(getClass().getResource("icon.png"));

        java.awt.TrayIcon trayIcon = new java.awt.TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("The Resto Manager | Order is ready");
        tray.add(trayIcon);

        trayIcon.displayMessage(foodName + " is ready!!", "of Table number: " + tableNo, MessageType.INFO);
        
        System.out.print("\007"); // \007 is the ASCII bell
        System.out.flush();
    }
    
}

