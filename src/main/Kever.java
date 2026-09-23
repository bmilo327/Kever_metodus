/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class Kever {

    /**
     * @param args the command line arguments
     */
    static String[] pakli = new String[22];
    static String[] ujPakli = new String[22];
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static String[] kever(int tipp) {
        switch (tipp) {
            case 1:
                for (int i = 1; i < 7; i++) {
                    ujPakli[i]= pakli[20-((i-1)*3)];
                    ujPakli[i+7]= pakli[19-((i-1)*3)];
                    ujPakli[i+14]= pakli[21-((i-1)*3)];
                }
                break;
            /*case:2*/
                
                
                
            /*case:3*/
            
               
            default:
                throw new AssertionError();
        }
        return ujPakli;
    }
    
}
