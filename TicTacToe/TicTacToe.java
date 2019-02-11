
import java.util.Scanner;
public class TicTacToe {
    
    
    public static void main(String[] args) {
       int Number;
       Scanner input = new Scanner(System.in);
       System.out.println("1 player or 2 Player (hehe only 2 player option available)"); 
       int playernumber = input.nextInt();
       System.out.println("Player 1 is X and player 2 is O");
       int random = (int )(Math.random() * 100 + 1);
       String playerone="";
       String playertwo="";
       String b[] = new String[9];
       
       if (random<50) {
           System.out.println("X goes first");
           String player1 = "X";
           String player2 = "O";
           playertwo= player2;
           playerone = player1;
        }
       else if (random>=50) {
           System.out.println("O goes first");
           String player1 = "O";
           String player2 = "X";
           playertwo= player2;
           playerone = player1;
        }
        
       for (int i=0; i<9; i++) {
           b[i]=Integer.toString(i); }
        System.out.println("+---+---+---+");
        System.out.println("| " + b[0] + " | " + b[1] + " | " + b[2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + b[3] + " | " + b[4] + " | " + b[5] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + b[6] + " | " + b[7] + " | " + b[8] + " |");
        System.out.println("+---+---+---+");
        
       if (playernumber==2) 
       {
           Test user= new Test();
           while (user.getStatus()==false) {
            System.out.println(playerone +  "Turn 1: Type in gridnumber you would like to place ur mark.");
            Number=input.nextInt();
            user.gridChange(playerone, Number);
            user.win();
            System.out.println(playertwo + "Turn 1: Type in gridnumber you would like to place ur mark.");
            Number=input.nextInt();
            user.gridChange(playertwo, Number);
            user.win();
            System.out.println(playerone +  " Turn 2: Type in gridnumber you would like to place ur mark.");
            Number=input.nextInt();
            user.gridChange(playerone, Number);
            user.win();
            System.out.println(playertwo + " Turn 2: Type in gridnumber you would like to place ur mark.");
            Number=input.nextInt();
            user.gridChange(playertwo, Number);
            user.win();
            System.out.println(playerone +  " Turn 3: Type in gridnumber you would like to place ur mark.");
            Number=input.nextInt();
            user.gridChange(playerone, Number);
            user.win();
            System.out.println(playertwo + " Turn 3: Type in gridnumber you would like to place ur mark.");
            Number=input.nextInt();
            user.gridChange(playertwo, Number);
            user.win();
            System.out.println(playerone +  " Turn 4: Type in gridnumber you would like to place ur mark.");
            Number=input.nextInt();
            user.gridChange(playerone, Number);
            user.win();
            System.out.println(playertwo + " Turn 4: Type in gridnumber you would like to place ur mark.");
            Number=input.nextInt();
            user.gridChange(playertwo, Number);
            user.win();
            System.out.println(playerone +  " Turn 5: Type in gridnumber you would like to place ur mark.");
            Number=input.nextInt();
            user.gridChange(playerone, Number);
            user.win();
            }
           user.getWinner();
           user.getNum();
           user.getStatus();
           for (int i=0; i<9; i++) {
           b[i]=user.Grid()[i]; }
           System.out.println("+---+---+---+");
            System.out.println("| " + b[0] + " | " + b[1] + " | " + b[2] + " |");
            System.out.println("+---+---+---+");
            System.out.println("| " + b[3] + " | " + b[4] + " | " + b[5] + " |");
            System.out.println("+---+---+---+");
            System.out.println("| " + b[6] + " | " + b[7] + " | " + b[8] + " |");
            System.out.println("+---+---+---+");
         }
    }    
}
//problems i cant figure out->
//1. I want to print the board after every input, butidk how to do that
//2. The grid code doesnt really work and at the end it doesnt make any changes 
//-idk if this means that the Test code doesnt work because user.getWinner, getNum and getStatus dont print too
