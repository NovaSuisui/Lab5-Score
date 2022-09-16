/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerwithevent;

import java.util.Scanner;

/**
 *
 * @author SK
 */
public class ObserverWithEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScoreSource scS = new ScoreSource();
        ScoreListener user1 = new UserListener();
        UserListener user2 = new UserListener();
        scS.addMyListener(user1);
        scS.addMyListener(user2);
        Scanner in = new Scanner(System.in);
        int i = 1;
        String sc = "";
        System.out.print("Enter Score "+i+" : ");
        sc = in.nextLine(); 
        while(!sc.isEmpty()){    
            scS.setSource(sc);
            i++;
            System.out.print("Enter Score "+i+" : ");
            sc = in.nextLine(); 
        }
    }
    
}
