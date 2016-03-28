import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class VotingSystemDriver
{
     private static void createAndDisplayGUI()
    {
        //Create and set up the window.
        VotingSystem frame = new VotingSystem();

        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        createAndDisplayGUI();
    }
    
}