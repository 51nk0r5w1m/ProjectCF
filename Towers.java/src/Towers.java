public class Towers {
    private int numDiscs;        // Number of discs

    //Constructor param - the number of discs to use
    public Towers(int n) {
        this.numDiscs = n;

        // Move the number of discs from peg 1 to peg 3
        // using peg 2 as a temporary storage location.
        //calling recursive method
        this.moveDiscs(this.numDiscs, 1, 3, 2);
    }

    //The moveDiscs method displays a disc move using a recursive algorithm
    private void moveDiscs(int num, int fromPeg,
                           int toPeg, int tempPeg) {
        if (num > 0) {
            //recursive call - creates another whole copy of method in RAM
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
            System.out.println("Move a disc from peg " +
                    fromPeg + " to peg " + toPeg);

            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}
