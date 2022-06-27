import java.util.Arrays;

//Class for creating the view

public class Field {
    private String field[];
    private static final int MAX_DIM = 9;

    public Field(){
        field = new String[MAX_DIM];
        start();
    }

    public String[] getField() {
        return field;
    }

    //For printing the field
    @Override
    public String toString() {
        String s = "";
        int c = 1;
        for(int i = 0; i < MAX_DIM; i++){
            if(c%3 == 0){
                s += field[i]+"";
                s+='\n';
            }
            else{
                s += field[i]+"";
            }
            c++;
        }
        return s;
    }

    private void start(){
        for (int i = 0; i < MAX_DIM; i++) {
            field[i] = "-";
        }
    }
}
