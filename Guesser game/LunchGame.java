import java.util.*;

class Guesser
{
    int guessNum;
  int  GuessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! kindly guess the number");
         guessNum= scan.nextInt();
          return guessNum;
}
}
class player
{
  int guessNum;
  int guessingNumber()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Player! kindly guess the number");
    guessNum= scan.nextInt();
    return guessNum;
  }
}
class Umpire
{
int numFromGuesser;
int numFromPlayer1;
int numFromPlayer2;
int numFromPlayer3;

void collectNumFromGuesser()
{
  Guesser g=new Guesser();
  numFromGuesser=g.GuessingNumber();
}
void collectNumFromPlayers()
{
  player p1=new player();
  player p2=new player();
  player p3=new player();
  numFromPlayer1=p1.guessingNumber();
  numFromPlayer2=p2.guessingNumber();
  numFromPlayer3=p3.guessingNumber();

}
void compare()
{
  if (numFromGuesser == numFromPlayer1) {
    if (numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
      System.out.println("sab ne sahi anwer diya!! sb winner hai bhai");
      
    }
    else if (numFromGuesser==numFromPlayer2){
      System.out.println(" player 1 and player 2 won this game!!!!");
    }
    else if (numFromGuesser==numFromPlayer3)
    {
      System.out.println("player 1 and player 3 won this game");
    }
    else {
      System.out.println("Player 1 won the game");
    }
    
    
  }
  else if (numFromGuesser==numFromPlayer2) {
    if (numFromGuesser==numFromPlayer3) {
      System.out.println("player 2 and 3 win this match");
      
    }
    else {
      System.out.println("Player 2 won this game");
    }
    System.out.println("player 2 won the game");}
    else if (numFromGuesser==numFromPlayer3) {
      System.out.println("player 3 won the game");
    }
    else {
      System.out.println("sab ke sab galat ho!!! aap game har gye");
    }
    
  }
}



public class LunchGame {
    public static void main(String[] args) {
        System.out.println("Start Game");
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();

      
    }
    
}
