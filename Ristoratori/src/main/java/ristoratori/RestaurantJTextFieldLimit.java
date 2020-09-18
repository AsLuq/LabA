package ristoratori;

import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;

/**
 *
 * @author Asghar Luqman
 * @author Zuffellato Cristian
 */

public class RestaurantJTextFieldLimit extends PlainDocument{
    private final int limit;
    
    public RestaurantJTextFieldLimit(int lim){
        this.limit = lim;
    }
    
    @Override
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
