import java.util.Arrays;
import java.util.Scanner;

public class Tris {
    private Field field;
    private Player player1;
    private Player player2;
    private CPU cpu;
    private boolean turn;
    private Player currentPlayer;


    public Tris() {
        field = new Field();
        player1 = new Player("o");
        player2 = new Player("x");
        cpu = new CPU("x");
        turn = true;
    }

    public boolean win(String symbol, Field field) {
        if (field.getField()[0] == symbol && field.getField()[1] == symbol && field.getField()[2] == symbol) {
            if (symbol == "o") {
                System.out.println("Ha vinto il player 1");
            } else if (symbol == "x") {
                System.out.println("Ha vinto il player 2");
            }
            return true;
        } else if (field.getField()[3] == symbol && field.getField()[4] == symbol && field.getField()[5] == symbol) {
            if (symbol == "o") {
                System.out.println("Ha vinto il player 1");
            } else if (symbol == "x") {
                System.out.println("Ha vinto il player 2");
            }
            return true;
        } else if (field.getField()[6] == symbol && field.getField()[7] == symbol && field.getField()[8] == symbol) {
            if (symbol == "o") {
                System.out.println("Ha vinto il player 1");
            } else if (symbol == "x") {
                System.out.println("Ha vinto il player 2");
            }
            return true;
        } else if (field.getField()[0] == symbol && field.getField()[3] == symbol && field.getField()[6] == symbol) {
            if (symbol == "o") {
                System.out.println("Ha vinto il player 1");
            } else if (symbol == "x") {
                System.out.println("Ha vinto il player 2");
            }
            return true;
        } else if (field.getField()[1] == symbol && field.getField()[4] == symbol && field.getField()[7] == symbol) {
            if (symbol == "o") {
                System.out.println("Ha vinto il player 1");
            } else if (symbol == "x") {
                System.out.println("Ha vinto il player 2");
            }
            return true;
        } else if (field.getField()[2] == symbol && field.getField()[5] == symbol && field.getField()[8] == symbol) {
            if (symbol == "o") {
                System.out.println("Ha vinto il player 1");
            } else if (symbol == "x") {
                System.out.println("Ha vinto il player 2");
            }
            return true;
        } else if (field.getField()[0] == symbol && field.getField()[4] == symbol && field.getField()[8] == symbol) {
            if (symbol == "o") {
                System.out.println("Ha vinto il player 1");
            } else if (symbol == "x") {
                System.out.println("Ha vinto il player 2");
            }
            return true;
        } else if (field.getField()[2] == symbol && field.getField()[4] == symbol && field.getField()[6] == symbol) {
            if (symbol == "o") {
                System.out.println("Ha vinto il player 1");
            } else if (symbol == "x") {
                System.out.println("Ha vinto il player 2");
            }
            return true;
        }
        return false;
    }

    public boolean isFull() {
        int f = 0;
        for (int i = 0; i < 9; i++) {
            if (field.getField()[i] != "-") {
                f++;
            }
        }
        if (f == 9) {
            return true;
        }
        return false;
    }

    public void isPlayerTurn(int choice) {
        if(choice == 1) {
            if (turn) {
                turn = false;
                currentPlayer = player1;

            } else {
                turn = true;
                currentPlayer = player2;
            }
        }
        else if(choice == 0){
            if (turn) {
                turn = false;
                currentPlayer = player1;

            } else {
                turn = true;
                currentPlayer = cpu;
            }
        }
    }

    public Field getField() {
        return field;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void startGame() {
        Scanner pos = new Scanner(System.in);
        Scanner cho = new Scanner(System.in);
        int multi = 0;
        System.out.println("0 - Vs. CPU" + '\n' + "1 - Multiplayer");
        multi = cho.nextInt();
        boolean winner = false;
        while (!winner) {
            isPlayerTurn(multi);
            currentPlayer.actionPlayer(pos.nextInt(), field);
            if (win(currentPlayer.getSymbol(), field)) {
                winner = true;
                break;
            }
            if (isFull()) {
                System.out.println("Pareggio");
                winner = true;
                break;
            }
            System.out.println(field.toString());
        }
        System.out.println(field.toString());
    }
}
