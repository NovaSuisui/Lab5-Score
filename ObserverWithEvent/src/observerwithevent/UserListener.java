/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerwithevent;

/**
 *
 * @author SK
 */
public class UserListener implements ScoreListener{
    @Override
    public void update(ScoreEvent e){
        System.out.println("Senior : "+e.getSomeData());
    }
}
