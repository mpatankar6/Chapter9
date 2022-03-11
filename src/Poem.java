import java.lang.reflect.Method;

public class Poem {

    private final int numLines;

    public Poem(int n) {
        numLines = n;
    }

    public void printRhythm() {
        System.out.println("Free Verse!");
    }

    public void printTas(int syll) {
        for (int j = 0; j < syll; j++) {
            System.out.print("ta");
            if (j != syll - 1) System.out.print("-");
        }
        System.out.print("\n");
    }

    public int getNumlines() {
        return numLines;
    }
}

