/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovserverwithbound;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author SK
 */
public class ScoreSource implements Serializable {
    
    public static final String SCOREDATA_PROPERTY = "scoreData";
    
    private String scoreData;
    
    private PropertyChangeSupport propertySupport;
    
    public ScoreSource() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreData() {
        return scoreData;
    }
    
    public void setScoreData(String value) {
        String oldValue = scoreData;
        scoreData = value;
        propertySupport.firePropertyChange(SCOREDATA_PROPERTY, oldValue, scoreData);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
