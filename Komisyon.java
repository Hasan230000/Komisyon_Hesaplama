/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package komisyon;
import java.util.Scanner;
/**
 *
 * @author Costa
 */
public class Komisyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner veri=new Scanner(System.in);
        
        double toplam=0, x;
        int [] mal=new int [5];
        for(int i=0;i<=4; ++i){
            System.out.print("\n"+(i+1)+". malın fiyatını giriniz=");
            mal[i]=veri.nextInt();
            x=mal[i];
            if(x<=50)
                toplam+=(x*0.03);
            else if(x>50)
                toplam+=(x*0.02);
            }
        System.out.print("Toplam komisyon="+toplam);
    }
    
}
