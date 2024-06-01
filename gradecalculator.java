import java.util.Scanner;
public class gradecalculator {
    public static void main(String[]args){
       mark_avrage_calculation();
    }
    public static void mark_avrage_calculation(){
        System.out.println(" STUDENT GRADE CALCULATOR :");
        Scanner sc=new Scanner(System.in);
        int math,eng,java,python,dsa,dbms;
        int total=600;
        System.out.println(" enter mark of mathematics as you scored out of 100:");
        math = sc.nextInt();
        System.out.println(" enter mark of english as you scored out of 100:");
        eng= sc.nextInt();
        System.out.println(" enter mark java as you scored out of 100:");
        java= sc.nextInt();
        System.out.println(" enter mark of python as you scored out of 100:");
        python= sc.nextInt();
        System.out.println(" enter mark of dsa as you scored out of 100:");
        dsa= sc.nextInt();
        System.out.println(" enter mark of dbms as you scored out of 100:");
        dbms= sc.nextInt();
        int sum=math+eng+java+python+dsa+dbms;
        System.out.println("SUM OF MARKS is :"+sum +" out of "+total);
        float avg=sum/6;
        System.out.println("avrage is :"+avg);
        //calculation of grades
        if(avg>=90)
            System.out.println("Grade A");
        else if(avg>=80)
            System.out.println("Grade B");
        else if(avg>=70)
            System.out.println("Grade C");
        else if(avg>=60)
            System.out.println("Grade D");
        else if(avg>=40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");

        System.out.println("  THANK YOU ! ");
    }
}
