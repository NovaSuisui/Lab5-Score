/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerwithevent;

import java.util.ArrayList;

/**
 *
 * @author SK
 */
public class ScoreSource {
    private ArrayList<ScoreListener> listeners;
    public ScoreSource() {
	listeners = new ArrayList<>();
    }
    public void setSource(String scoreData) {
	fireScoreEvent(new ScoreEvent(this, scoreData));
    }
    public void addMyListener(ScoreListener l) {
	listeners.add(l);
    }
    public void removeMyListener(ScoreListener l) {
	listeners.remove(l);
    }
    public void fireScoreEvent(ScoreEvent e) {
        for(int i = 0; i < listeners.size(); i++) {
            ScoreListener l = listeners.get(i);
            l.update(e);
        }
    }
}
