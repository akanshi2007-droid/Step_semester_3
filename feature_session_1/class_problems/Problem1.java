package feature_session_1.class_problems;
import java.util.*;

public class Problem1{
    static String playRound(String playerMove,String computerMove){
        if(playerMove.equals(computerMove))return "Draw";
        if((playerMove.equals("Rock")&&computerMove.equals("Scissors"))||(playerMove.equals("Paper")&&computerMove.equals("Rock"))||(playerMove.equals("Scissors")&&computerMove.equals("Paper")))return "Player Wins";
        return "Computer Wins";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        String[] moves={"Rock","Paper","Scissors"};
        String[] players=new String[5];
        String[] computers=new String[5];
        String[] results=new String[5];
        int wins=0,losses=0,draws=0;
        for(int i=0;i<5;i++){
            System.out.print("Enter Rock, Paper or Scissors: ");
            players[i]=sc.next();
            computers[i]=moves[r.nextInt(3)];
            results[i]=playRound(players[i],computers[i]);
            if(results[i].equals("Player Wins"))wins++;
            else if(results[i].equals("Computer Wins"))losses++;
            else draws++;
            System.out.println("Player: "+players[i]+" Computer: "+computers[i]+" Result: "+results[i]);
        }
        double percentage=wins*100.0/5;
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);
        System.out.println("Draws: "+draws);
        System.out.println("Win Percentage: "+percentage+"%");
    }
}