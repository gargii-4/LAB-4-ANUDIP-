import java.util.*;

public class Cal_Grades{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("**** GRADES CALCULATOR ****");
        System.out.print("\nEnter Subject 1 : ");
        String sub1 = sc.nextLine();
        System.out.print("Enter Subject 2 : ");
        String sub2 = sc.nextLine();
        System.out.print("Enter Subject 3 : ");
        String sub3 = sc.nextLine();
        System.out.print("Enter Subject 4 : ");
        String sub4 = sc.nextLine();
        System.out.print("Enter Subject 5 : ");
        String sub5 = sc.nextLine();
        System.out.print("\nEnter marks for "+sub1+" : ");
        int marks1 = sc.nextInt();
        System.out.print("Enter marks for "+sub2+" : ");
        int marks2 = sc.nextInt();
        System.out.print("Enter marks for "+sub3+" : ");
        int marks3 = sc.nextInt();
        System.out.print("Enter marks for "+sub4+" : ");
        int marks4 = sc.nextInt();
        System.out.print("Enter marks for "+sub5+" : ");
        int marks5 = sc.nextInt();
        double avg = (marks1+marks2+marks3+marks4+marks5)/5;
        System.out.print("\nPercentage : "+avg+" %");
        if(avg<40){
            System.out.print("\nGrade : D");
        }
        else if(avg>=40 && avg<60){
            System.out.print("\nGrade : C");
        }
        else if(avg>=60 && avg<80){
            System.out.print("\nGrade : B");
        }
        else if(avg>=80 && avg<90){
            System.out.print("\nGrade : A");
        }
        else if(avg>=90){
            System.out.print("\nGrade : O");
        }
        else{
            System.out.print("Invalid marks");
        }
        sc.close();
    }
}
