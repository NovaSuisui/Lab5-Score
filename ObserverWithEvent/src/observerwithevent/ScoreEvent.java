/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerwithevent;

import java.util.EventObject;

/**
 *
 * @author SK
 */
public class ScoreEvent extends EventObject {
    private String scoreData;
    public ScoreEvent(Object o, String scoreData) {
        super(o);
        this.scoreData = scoreData;
    }
    
    public String getSomeData(){
        return scoreData;
    }
    
}
