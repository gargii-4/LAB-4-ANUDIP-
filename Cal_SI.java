/*Write a program to enter P,T (principal and time) and calculate
simple interest. Use the Scanner class for taking inputs from the
console. Users will enter the principal amount and time(in years).*/
import java.util.*;

public class Cal_SI{
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("*** SIMPLE INTEREST WILL BE CALCULATED ACCORDINH TO THE RATE OF INTEREST***");
        System.out.print("\nEnter the PRINCIPAL AMOUNT : ");
        int pamt = sc.nextInt();
        System.out.print("\nEnter the TIME PERIOD (in years) : ");
        int time = sc.nextInt();
        int rate=0;
        if(pamt<=5000){
            rate=5;
        }
        else if(pamt>5000 && pamt<10000){
            rate=8;
        }
        else if(pamt>=10000){
            rate=10;
        }
        else{
            System.out.print("\nInvalid Principal Amout....");
        }
        System.out.print("\nThe SIMPLE INTEREST IS : "+((pamt*rate*time)/100)+"\nWhere....\nPrincipal Amount : "+pamt+"\nTime Period : "+time+" years\nRate of Interest : "+rate+"\n-------------");
    } 
}
