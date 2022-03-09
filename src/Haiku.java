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
            for (int j = 0; j < getSyllables(i); j++) {
                System.out.print("ta");
                if (j != getSyllables(i) - 1) System.out.print("-");
            }
            System.out.print("\n");
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
