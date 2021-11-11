/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mastj
 */
public class colorselection {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        char c='G';
        switch(c)
        {
            case 'R':
                System.out.println("Red");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            default:
                System.out.println("No Color");   
        }
    }
}
