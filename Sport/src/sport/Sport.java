/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sport;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Sport {

    private String province;

    public Sport(String province) {

        this.province = province;
    }

    public String getProvince() {

        return province;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter province");
        String prov= input.next();
        System.out.println("Enter num players");
        int num= input.nextInt();
        
        Sport p= new Sport(prov);
        Basketball b= new Basketball(prov,num);
        
        b.display();
    }

}

class Basketball extends Sport {

    private int numPlayers;

    public Basketball(String province, int num) {
        super(province);
        this.numPlayers = num;
    }
    
    public void display(){
    
        System.out.println("The number of players in "+super.getProvince()+ " is "+ this.numPlayers);
    }

}
