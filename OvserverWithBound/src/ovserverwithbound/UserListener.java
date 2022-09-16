/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovserverwithbound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author SK
 */
public class UserListener implements PropertyChangeListener{
    
    @Override
    public void propertyChange(PropertyChangeEvent e){
        System.out.println("Score with Bound : "+e.getNewValue());
    }
}
