public class Poem {

    private int numLines;

    public Poem(int n) {
        numLines = n;
    }

    public void printRhythm() {
        System.out.println("Free Verse!");
    }

    public int getNumlines() {
        return numLines;
    }
}

