import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Dimension;

public class SafeConverter 
{
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;    
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JTextField text;
    private JLabel label;
    private int checked;
    private InputValidator myValidation;
    
    public SafeConverter()
    {
        panel = new JPanel();
        button1 = new JButton("Convert F to C");
        button2 = new JButton("Convert F to K");
        button3 = new JButton("Convert C to K");    
        button4 = new JButton("Convert C to F");
        button5 = new JButton("Convert K to F");
        button6 = new JButton("Convert K to C");
        text = new JTextField(3);//3 cols, not 20 chars
        label = new JLabel("Enter a temperature            ");
        myValidation = new InputValidator();
        //text.setInputVerifier(myValidation);
       
        checked = 0;
      
        //Load the listener
        button1.addActionListener(buttonFtoC());
        button2.addActionListener(buttonFtoK()); 
        button3.addActionListener(buttonCtoK()); 
        button4.addActionListener(buttonCtoF()); 
        button5.addActionListener(buttonKtoF());
        button6.addActionListener(buttonKtoC()); 
        
        //load the panel
        panel.add(text);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(label);
    }
    
    public Component getContent()
    {
        return (panel);
    }
    
    private ActionListener buttonFtoC() 
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
                checked = myValidation.verify(text);
                
                if(checked == 0)
                {
                   String myText = "Error: Input blank";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else if(checked == 2)
                {
                   String myText = "Error: Input is not a number";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else
                {
                    String input = text.getText();
                    double tempInF = Double.parseDouble(input);//convert String to double
                    double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
                    String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
                    label.setText(newText);
                    System.out.println(newText);
                }
            }
        };
        
        return listener;
    }   
    
    private ActionListener buttonFtoK() 
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checked = myValidation.verify(text);
                
                if(checked == 0)
                {
                   String myText = "Error: Input blank";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else if(checked == 2)
                {
                   String myText = "Error: Input is not a number";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else
                {
                    String input = text.getText();
                    double tempInF = Double.parseDouble(input);//convert String to double
                    double tempInK = (tempInF+459.67)*(5.0/9.0); //convert F to K
                    String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and

                    label.setText(newText);
                    System.out.println(newText);
                }
            }
        };
        
        return listener;
    }   
    
    private ActionListener buttonCtoK()
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checked = myValidation.verify(text);
                
                if(checked == 0)
                {
                   String myText = "Error: Input blank";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else if(checked == 2)
                {
                   String myText = "Error: Input is not a number";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else
                {
                    String input = text.getText();
                    double tempInC = Double.parseDouble(input);//convert String to double
                    double tempInK = (tempInC+273.15); //convert C to K
                    String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
                                                   //only display 2 places past decimal
                    label.setText(newText);
                    System.out.println(newText);
                }
            }

        };
        
        return listener;
    }   
    
    private ActionListener buttonCtoF()
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checked = myValidation.verify(text);
                
                if(checked == 0)
                {
                   String myText = "Error: Input blank";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else if(checked == 2)
                {
                   String myText = "Error: Input is not a number";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else
                {
                    String input = text.getText();
                    double tempInC = Double.parseDouble(input);//convert String to double
                    double tempInF = (tempInC*1.8)+32; //convert F to C
                    String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and

                    label.setText(newText);
                    System.out.println(newText);
                }

            }
        };
        
        return listener;
    }   
    
    private ActionListener buttonKtoF() 
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checked = myValidation.verify(text);
                
                if(checked == 0)
                {
                   String myText = "Error: Input blank";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else if(checked == 2)
                {
                   String myText = "Error: Input is not a number";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else
                {
                    String input = text.getText();
                    double tempInK = Double.parseDouble(input);//convert String to double
                    double tempInF = (tempInK*(9.0/5.0)-459.67); //convert K to F
                    String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
                    
                    label.setText(newText);
                    System.out.println(newText);
                }
            
            }
        };
        
        return listener;
    }   
    
    private ActionListener buttonKtoC()
    {
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checked = myValidation.verify(text);
                
                if(checked == 0)
                {
                   String myText = "Error: Input blank";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else if(checked == 2)
                {
                   String myText = "Error: Input is not a number";
                   label.setText(myText);
                   System.out.println(myText);
                }
                else
                {
                    String input = text.getText();
                    double tempInK = Double.parseDouble(input);//convert String to double
                    double tempInC = (tempInK-273.15); //convert F to C
                    String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and

                    label.setText(newText);
                    System.out.println(newText);
                }
           
            }
        };
        
        return listener;
    }  
    
}