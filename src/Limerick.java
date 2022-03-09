public class Limerick extends Poem {

    public Limerick() {
        super(5);
    }

    @Override
    public int getNumlines() {
        return super.getNumlines();
    }

    @Override
    public void printRhythm() {
        for (int i = 0; i <= 5; i++) {
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
                return 9;
            case 2:
                return 9;
            case 3:
                return 6;
            case 4:
                return 6;
            case 5:
                return 9;
            default:
                return 0;
        }
    }
}
