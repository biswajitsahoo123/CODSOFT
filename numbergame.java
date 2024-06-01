import java.util.Scanner;
import java.util.Random;
public class numbergame {
    public static void main(String[]args){
        generateRandom();
    }
    public static void  generateRandom(){
        Random rand=new Random();
        //generating a random number
        int randomNum=rand.nextInt(101);
        guessnum(randomNum);
    }
    public static void guessnum(int randomNum){
        int attempt=5;
        int score=attempt;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO NUMBER GAME");
        //input number as user choice
        for( i=0 ;i < attempt;i++){
            System.out.println("enter your guess number in between 0 and 100 :");
            System.out.println("remember you have only 5 attempts");
            System.out.println("ENTER YOUR NUMBER :");
            int guess= sc.nextInt();
            if(randomNum==guess){
                System.out.println("congratulation ! you guessed the number :");
                System.out.println("score is "+score);
                break;
            }
            else if (randomNum>guess) {
                System.out.println("the number is too high than the guess number :"+guess +  ": you have "+(attempt-1)+"tries left");
            }
            else if (randomNum<guess && i !=attempt-1) {
                System.out.println("the number is too low than the guess number :"+guess +  ": you have "+(attempt-1)+"tries left");
            }
            score=score-1;
        }
        if(i==attempt){
            System.out.println(" ALL YOUR ATTEMPTS FINISHED NOW");
            System.out.println("THE ACTUAL NUMBER WAS :"+randomNum);
            System.out.println("you score :"+(attempt-attempt));
        }
        //play again or exist ?
        System.out.println("press 1 to play again:");
        System.out.println("press  0  to exist:");
        int press=sc.nextInt();
        if(press==1){
            generateRandom();
        }
        else{
            return;
        }
    }
}
