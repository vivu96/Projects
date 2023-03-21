import java.util.*;
import static java.lang.System.*;
public class rockPaperSiggerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("O for rock:");
        out.println("1 for paper");
        System.out.println("2 for sigger");       
        System.out.println("Your Trun!!!");
       
        int user;
        int computer;
        int userWin=0;
        int computerWin=0;
        int tie=0;
        int game = 1;
    while (game<=5) {
            Random rand = new Random();
            computer= rand.nextInt(2);
            user = sc.nextInt();
      switch (user) {
        case 0:
                System.out.println("You choose rock:");
        break;
        case 1:
            System.out.println("you choose paper!");
        break;
        case 2:
            System.out.println("you choose sigger!!");
        }

    switch (computer) {
        case 0:
            System.out.println("computer choose rock:");
        break;
        case 1:
            System.out.println("computer choose paper!");
        break;
        case 2:
            System.out.println("computer choose sigger!!");
        }
        
         if (computer==user) {
            System.out.println("Match tie!!!!");
            tie++;
            
         }
         else if(computer==0 && user==1)
         {
            System.out.println("you won!!!");
            userWin++;
         }
         else if (computer==0 && user==2) {
            System.out.println("Computer won!!!");
            computerWin++;
         }
         else if(computer==1 && user==0 ){
            System.out.println("computer won!!!");
            computerWin++;
        }
         else if (computer==1 && user==2) {
            System.out.println("you won!!!");
            userWin++;
         }
         else if (computer==2 && user==0) {
            System.out.println("You won!!!");
            userWin++;
        }
         else if(computer==2 && user==1){
         System.out.println("computer won!!!");
         computerWin++;
        }
         
         if (game==5) {
            break;
         }
         game++;
        }
         System.out.println("-----------------------------------------");
         System.out.println("final Result is:");
         System.out.println("computer win" + ":"+ computerWin);
         System.out.println("you win" + ":"+ userWin);
         System.out.println("tie" + ":"+ tie);

         System.out.println("-----------------------------------------");
         if (computerWin>userWin) {
            System.out.println("computer win this match!!!!");
            
         }
         else if (computerWin==userWin) {
            System.out.println("This match is tie!!!!");
            
         }
         else {
            System.out.println("Congratulations!!!!\n\t you win this match.");
         }
        
}
}

