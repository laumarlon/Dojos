/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numromanos;

/**
 *
 * @author Laura Martinez
 */
public class NumRomanos {
    public static void main(String args[])
        {
            imprimir();
        }
    
    private static final String[] numRomanos = {"M","CM","DCCC","DCC","DC","D","CD","CCC","CC","C","XC","LXXX","LXX","LX","L","XL","XXX","XX","X","IX","VIII","VII","VI","V","IV","III","II","I"};
    private static final int[] numNaturales = {1000,900,800,700,600,500,400,300,200,100,90,80,70,60,50,40,30,20,10,9,8,7,6,5,4,3,2,1};

    public static String convRomanos(int num) {
        String romano = "";
        int natural = num; 
        for (int i = 0; i < numNaturales.length; i++) {
            while (natural >= numNaturales[i]) {
                    romano += numRomanos[i];
                    natural -= numNaturales[i];
            }
        }
        return romano;
    }

    public static void imprimir(){
        for(int i=1; i<=1000; i++){
            System.out.println(convRomanos(i));
        }
    }
}


