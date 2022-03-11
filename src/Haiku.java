public class Haiku extends Poem {

    public Haiku() {
        super(3);
    }

    @Override
    public int getNumlines() {
        return super.getNumlines();
    }

    @Override
    public void printRhythm() {
        for (int i = 0; i <= 3; i++) {
            super.printTas(getSyllables(i));

        }
    }

    public int getSyllables(int k) {
        switch (k) {
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 5;
            default:
                return 0;
        }
    }
}
