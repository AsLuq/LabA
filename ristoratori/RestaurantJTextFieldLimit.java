package ristoratori;

import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;

/**
 *
 * @author crist
 */

public class RestaurantJTextFieldLimit extends PlainDocument{
    private int limit;
    
    public RestaurantJTextFieldLimit(int lim){
        this.limit = lim;
    }
    
    public void insertString(int offset, String str, AttributeSet set) throws BadLocationException{
        if(str == null)
            return;
        else if((getLength() + str.length()) <= limit){
            super.insertString(offset, str, set);
    }
    }
    
}
