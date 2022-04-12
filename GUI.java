package gui;
import java.awt.BorderLayout;
import java.util.Dictionary;
import java.awt.*;
import javax.swing.*;

import jdk.jfr.Timestamp;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class GUI {


    public GUI(){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Click anywhere to start conversation");
        String textInput = "";
        String id = "";
        String text = "";
        String User = "";
        String UserName = "";
        String UserId = "";
        String birthday = "";
        String homeId = "";
        String locationId = "";
        String homeName = "";
        String locationName = "";
        String UserGender = "";
        
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("API Data");
        frame.pack();
        frame.setVisible(true);
        for (int i = 0; i <30; i++){
        textInput = JOptionPane.showInputDialog(frame, "Enter Hello to chat: ");

        if (textInput.equalsIgnoreCase("Hello") || textInput.equalsIgnoreCase("Hey") || textInput.equalsIgnoreCase("Hi")) {
        	for (int j = 0; j <30; j++){
        	String option = JOptionPane.showInputDialog(frame, "what can I help you today?\r\n" + "1 Check data from Twitter API\r\n"
        			+ "2 Check data from Facebook Graph API\r\n");
        	if (option.equals("1")) {
        		id = "1512552282629451778";
                text = "So !!! Kayla McBride got so much game too!! TOUGH!!! https://t.co/7itOAHrT3d";
                User = "KingJames";
                UserName = "LeBron James";
                UserId = "23083404";
                

               String optionT =  JOptionPane.showInputDialog(frame, "Which data are you looking for?\r\n"
        	+ "1 Latest Tweet info\r\n"
            		   + "2 User info\r\n");
               if(optionT.equals("1")) {
            	   JOptionPane.showMessageDialog(frame, "Tweet id:" + id + "\r\nText: " + text);
            	   
               }else if(optionT.equals("2")) {
            	   JOptionPane.showMessageDialog(frame, "User id:" + UserId + "\r\nUser: " + User + "\r\nUsername: " + UserName);
               }else {
            	   JOptionPane.showMessageDialog(frame, "You wrote an invalid command, please try again ");
               }
                j = 31;
        	}else if (option.equals("2")) {
        		homeId = "101982876505827";
                homeName = "Tseung Kwan O, Hong Kong";
                locationId = "111949595490847";
                locationName = "Kelowna";
                birthday = "06/25/2000";
                UserName = "Owen Wong";
                UserGender = "male";
                UserId = "5399872473358479";
                JOptionPane.showMessageDialog(frame, "Here is the User info from Facebook:\r\n" + 
                "User id:" + UserId + "\r\nUsername: " + UserName + "\r\nGender: " + UserGender
             		   + "\r\nBirthday: " + birthday + "\r\nHometown Id: " + homeId + "\r\nHometown name: " + homeName
             		  + "\r\nLocation Id: " + locationId + "\r\nLocation name: " + locationName);
                j = 31;
        	}else {
	JOptionPane.showMessageDialog(frame, "You wrote an invalid command, please try again ");
}
        }
        }else {
        	JOptionPane.showMessageDialog(frame, "You wrote an invalid command, please try again ");
        }
    }
    

   

}

    public static void main(String[] args){
   
        new GUI();
        
    }
}
