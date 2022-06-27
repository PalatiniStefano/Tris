import java.util.Scanner;

public class CPU extends Player{
    public CPU(String s) {
        super(s);
    }

    //Method used for the action of the CPU. The CPU will place its symbol in one of the empty boxes
    public void actionPlayer(int pos, Field field) {
        int random = 0;
        random = (int)(Math.random()*9);
        if(field.getField()[random] == "-"){
            field.getField()[random] = getSymbol();
        }
        else if(field.getField()[random] != "-"){
            while(field.getField()[random] != "-"){
                random = (int)(Math.random()*9);
            }
            field.getField()[random] = getSymbol();
        }
    }
}
