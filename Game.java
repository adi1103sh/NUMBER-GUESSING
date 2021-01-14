package com.company;
import java.util.*;
public class Game {
    int noOfGuesses=0;
    int number;
    public Game(int n){
        number=n;
    }
    public void Bigger(){
        System.out.println("You guessed bigger number, Lower yourself");
    }
    public void Smaller(){
        System.out.println("You guessed smaller number, Higher yourself");
    }

    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(101);
        Game play=new Game(num);
        Scanner sc=new Scanner(System.in);
        int guess;
        System.out.println("1. Play by guessing the number\n" +
                "2. Follow the hints to get close to the number\n" +
                "3. Try to guess in less no. of chances");
        System.out.println("Lets PLay!!!");
         while(true){
            System.out.println("Your number please(between 0 to 100)");
            guess=sc.nextInt();
            play.noOfGuesses++;
            if(guess> play.number){
                play.Bigger();
            }
            else if(guess< play.number){
                play.Smaller();
            }
            else{
                System.out.println("Guess Successful!!!");
                System.out.println("You took "+play.noOfGuesses+" attempts to guess");
                System.out.println("Thanks for entertaining yourself😊");
                break;
            }
        }
    }
}
