import java.util.Scanner;

public class Player {
    private String symbol;

    public Player(String s){
        this.symbol = s;
    }

    public void actionPlayer(int pos, Field field){
        if(field.getField()[pos-1].equals("-")){
            field.getField()[pos-1] = symbol;
        }
        //If the postion is already taken, the player has to choose another place
        else{
            while(field.getField()[pos-1] != "-"){
                System.out.println("Error! Insert another position");
                Scanner in = new Scanner(System.in);
                pos = in.nextInt();
            }
            field.getField()[pos-1] = symbol;
        }
    }

    public String getSymbol() {
        return symbol;
    }
}
