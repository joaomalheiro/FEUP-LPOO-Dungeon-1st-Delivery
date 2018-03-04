package logic;

public class Hero extends GameCharacter {

    private char symbol;

    public Hero(int xCoord, int yCoord) {
        super(xCoord, yCoord);
        symbol = 'H';
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char s) { symbol = s; }
}

