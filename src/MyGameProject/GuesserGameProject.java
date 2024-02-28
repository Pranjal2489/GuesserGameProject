package MyGameProject;


import java.util.Scanner;

class Guesser{
    int guesser_num;
    public int takeGuesserNum() {
        System.out.println("Guesser Enter a number: ");

        Scanner scan=new Scanner(System.in);
        guesser_num=scan.nextInt();
        return guesser_num;
    }
}

class Player{
    int player_num;
    public int takePlayerNum() {
        System.out.println("Player Enter a number: ");
        Scanner scan=new Scanner(System.in);
        player_num=scan.nextInt();
        return player_num;
    }
}

class Umpire{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    //Four tasks of Umpire

    // task 1: to take number from Guesser
    void collectFromGuesser() {
        Guesser g=new Guesser();
        numFromGuesser=g.takeGuesserNum();
    }

    //task 2: to take number from players
    void collectFromPlayer() {

        Player p1=new Player();
        numFromPlayer1=p1.takePlayerNum();

        Player p2=new Player();
        numFromPlayer2=p2.takePlayerNum();

        Player p3=new Player();
        numFromPlayer3=p3.takePlayerNum();

    }
//	task 3: Comparison

    void compare(){

        if(numFromPlayer1==numFromGuesser) {

            if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser) {
                System.out.println("All the players Won the game");
            }
            else if(numFromPlayer2==numFromGuesser) {
                System.out.println("Player1 and Player2 won the game.Player3 loses");
            }
            else if(numFromPlayer3==numFromGuesser) {
                System.out.println("Player1 and Player3 won the game.Player2 loses");
            }
            else {
                System.out.println("Player1 won the game.Player3 and Player2 loses");
            }

        }
        else if(numFromPlayer2==numFromGuesser) {

            if(numFromPlayer3==numFromGuesser) {
                System.out.println("Player2 and Player3 won the game.Player 1 loses");
            }
            else {
                System.out.println("Player2 won the game.Player1 and Player3 loses. ");
            }

        }

        else if(numFromPlayer3==numFromGuesser) {

            System.out.println("Player3 won the game. Player1 and Player2 loses");

        }

        else {

            System.out.println("All players Lose the Game.");

        }



    }

}

public class GuesserGameProject {

    public static void main(String[] args) {
        Umpire u =new Umpire();
        u.collectFromGuesser();
        u.collectFromPlayer();
        u.compare();
    }
}

