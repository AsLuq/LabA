package clienti;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Luqman Asghar
 */
public class JTextFieldLimit extends PlainDocument {
    private int limit;
    
    public JTextFieldLimit(int lim){
        this.limit = lim;
    }
    
    /**
     * Checks if the String  has reached its max limit, and blocks users to add any other character
     */
    public void insertString(int offset, String str, AttributeSet set) throws BadLocationException{
     if(str == null)   
         return;
     else if((getLength() + str.length()) <= limit){
         super.insertString(offset, str, set);
     }
    }
}
