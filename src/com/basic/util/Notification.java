package com.basic.util;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javax.swing.JOptionPane;



public class Notification {
   public static void  successfullyMessage(String message){
       JOptionPane.showMessageDialog(null, null, message, 0);
   }
   
   public static void  errorMessage(String message){
       JOptionPane.showMessageDialog(null, null, message, 0);
   }
   
  
   
}
