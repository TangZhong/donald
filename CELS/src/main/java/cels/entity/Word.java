package main.java.cels.entity;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class Word extends BaseTerm {

    private char first;

    public char getFirst() {
        return first;
    }

    public void setFirst(char first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "Word{" +
                "first=" + first +
                '}';
    }
}
