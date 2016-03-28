import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
 
public class VotingSystem extends JFrame {
    GridLayout myLayout = new GridLayout(7,2);
    private JLabel message;
    private JButton cand1, cand2, cand3, cand4;
    private JTextField first, last;
    
    public VotingSystem() {

    }
     
    public void addComponentsToPane(final Container pane) {
        final JPanel myPanel = new JPanel();
        myPanel.setLayout(myLayout);
        
        //Set up components preferred size
        int maxGap = 20;
        JButton b = new JButton("Just fake button");
        Dimension buttonSize = b.getPreferredSize();
        myPanel.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 5)+maxGap,
                (int)(buttonSize.getHeight() * 3.5)+maxGap * 2));
         
                
        message = new JLabel("Enter your first and last name and select a candidate");
        cand1 = new JButton("Donald Trump");
        cand2 = new JButton("Darth Vader");
        cand3 = new JButton("Bill Nye");
        cand4 = new JButton("Obama");
        first = new JTextField(3);
        last = new JTextField(3);
        
        cand1.addActionListener(button1Action());
        cand2.addActionListener(button2Action());
        cand3.addActionListener(button3Action());
        cand4.addActionListener(button4Action());
        
        //Add buttons to experiment with Grid Layout
        myPanel.add(new JLabel("First Name:"));
        myPanel.add(first);
        myPanel.add(new JLabel("Last Name:"));
        myPanel.add(last);
        myPanel.add(new JLabel("Candidate 1:"));
        myPanel.add(cand1);
        myPanel.add(new JLabel("Candidate 2:"));
        myPanel.add(cand2);
        myPanel.add(new JLabel("Candidate 3:"));
        myPanel.add(cand3);
        myPanel.add(new JLabel("Candidate 4:"));
        myPanel.add(cand4);
        myPanel.add(message);
       
        pane.add(myPanel, BorderLayout.NORTH);

    }
    
    private ActionListener button1Action() 
	{
		//Create and define an action listener for cand1
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String vote1 = "Donald Trump";
                String firstName = first.getText();
			    String lastName = last.getText();
			    String filename = firstName + "_" + lastName + "_ballot.txt";
			    
			    String fullName = firstName + lastName;
			    
			    String newLine = System.getProperty("line.separator");
			    
			    boolean validUser = true;
			    
			    try
			    {
			        FileInputStream fstream = new FileInputStream("userNames.txt");
			        DataInputStream in = new DataInputStream(fstream);
			        BufferedReader br = new BufferedReader(new InputStreamReader(in));
			        String curLine;
			        
			        while((curLine = br.readLine()) != null)
			        {

			            if(curLine.equals(fullName))
			            {

			                validUser = false;
			            }
			            
			        }
			        
			        in.close();
			    
			        if(validUser == true)
			        {
			            try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename, true))))
			            {    
			                writer.println(vote1);
			                writer.close();
			                message.setText("Your vote has been saved");
			             }   
			             catch (IOException ex){
			                
			             }
			    
               
                        try(PrintWriter writer1 = new PrintWriter(new BufferedWriter(new FileWriter("userNames.txt", true))))
                        {
                            writer1.print(newLine + firstName + lastName);
                            writer1.close();
                        }    
                        catch (IOException ex){
			        
                        }
                    }
                    else
                    {
                        message.setText("User has already voted");
                    }
                }
                catch (Exception exc)
                {
                }
            }
        };
        return action;
    }
	
	private ActionListener button2Action() 
	{
		//Create and define an action listener for cand1
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String vote1 = "Darth Vader";
                String firstName = first.getText();
			    String lastName = last.getText();
			    String filename = firstName + "_" + lastName + "_ballot.txt";
			    
			    String fullName = firstName + lastName;
			    
			    String newLine = System.getProperty("line.separator");
			    
			    boolean validUser = true;
			    
			    try
			    {
			        FileInputStream fstream = new FileInputStream("userNames.txt");
			        DataInputStream in = new DataInputStream(fstream);
			        BufferedReader br = new BufferedReader(new InputStreamReader(in));
			        String curLine;
			        
			        while((curLine = br.readLine()) != null)
			        {

			            if(curLine.equals(fullName))
			            {

			                validUser = false;
			            }
			            
			        }
			        
			        in.close();
			    
			        if(validUser == true)
			        {
			            try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename, true))))
			            {    
			                writer.println(vote1);
			                writer.close();
			                message.setText("Your vote has been saved");
			             }   
			             catch (IOException ex){
			                
			             }
			    
               
                        try(PrintWriter writer1 = new PrintWriter(new BufferedWriter(new FileWriter("userNames.txt", true))))
                        {
                            writer1.print(newLine + firstName + lastName);
                            writer1.close();
                        }    
                        catch (IOException ex){
			        
                        }
                    }
                    else
                    {
                        message.setText("User has already voted");
                    }
                }
                catch (Exception exc)
                {
                }
            }
        };
        return action;
    }
    
    private ActionListener button3Action() 
	{
		//Create and define an action listener for cand1
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String vote1 = "Bill Nye";
                String firstName = first.getText();
			    String lastName = last.getText();
			    String filename = firstName + "_" + lastName + "_ballot.txt";
			    
			    String fullName = firstName + lastName;
			    
			    String newLine = System.getProperty("line.separator");
			    
			    boolean validUser = true;
			    
			    try
			    {
			        FileInputStream fstream = new FileInputStream("userNames.txt");
			        DataInputStream in = new DataInputStream(fstream);
			        BufferedReader br = new BufferedReader(new InputStreamReader(in));
			        String curLine;
			        
			        while((curLine = br.readLine()) != null)
			        {

			            if(curLine.equals(fullName))
			            {

			                validUser = false;
			            }
			            
			        }
			        
			        in.close();
			    
			        if(validUser == true)
			        {
			            try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename, true))))
			            {    
			                writer.println(vote1);
			                writer.close();
			                message.setText("Your vote has been saved");
			             }   
			             catch (IOException ex){
			                
			             }
			    
               
                        try(PrintWriter writer1 = new PrintWriter(new BufferedWriter(new FileWriter("userNames.txt", true))))
                        {
                            writer1.print(newLine + firstName + lastName);
                            writer1.close();
                        }    
                        catch (IOException ex){
			        
                        }
                    }
                    else
                    {
                        message.setText("User has already voted");
                    }
                }
                catch (Exception exc)
                {
                }
            }
        };
        return action;
    }
    
    private ActionListener button4Action() 
	{
		//Create and define an action listener for cand1
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String vote1 = "Obama";
                String firstName = first.getText();
			    String lastName = last.getText();
			    String filename = firstName + "_" + lastName + "_ballot.txt";
			    
			    String fullName = firstName + lastName;
			    
			    String newLine = System.getProperty("line.separator");
			    
			    boolean validUser = true;
			    
			    try
			    {
			        FileInputStream fstream = new FileInputStream("userNames.txt");
			        DataInputStream in = new DataInputStream(fstream);
			        BufferedReader br = new BufferedReader(new InputStreamReader(in));
			        String curLine;
			        
			        while((curLine = br.readLine()) != null)
			        {

			            if(curLine.equals(fullName))
			            {

			                validUser = false;
			            }
			            
			        }
			        
			        in.close();
			    
			        if(validUser == true)
			        {
			            try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename, true))))
			            {    
			                writer.println(vote1);
			                writer.close();
			                message.setText("Your vote has been saved");
			             }   
			             catch (IOException ex){
			                
			             }
			    
               
                        try(PrintWriter writer1 = new PrintWriter(new BufferedWriter(new FileWriter("userNames.txt", true))))
                        {
                            writer1.print(newLine + firstName + lastName);
                            writer1.close();
                        }    
                        catch (IOException ex){
			        
                        }
                    }
                    else
                    {
                        message.setText("User has already voted");
                    }
                }
                catch (Exception exc)
                {
                }
            }
        };
        return action;
    }
    
}