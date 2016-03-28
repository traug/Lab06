import javax.swing.InputVerifier;
import javax.swing.*;
import java.awt.event.*;

public class InputValidator {
    //@Override
    public int verify(JComponent input) {
        String text = ((JTextField) input).getText();

        if (text.isEmpty())
        {
            return 0;
        }

        else
        {
            try 
            {
                double inputValue = Double.parseDouble(text);
                return 1;
            }       
            catch (NumberFormatException e) 
            {
                return 2;
            }
        
        }
        
        

    }
}