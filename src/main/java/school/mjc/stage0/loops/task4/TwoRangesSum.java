package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sumSkip = 0;
        int sumCount = 0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }
        else if (lastInRow < numberToSkip) {
            System.out.println("number to skip is bugger then the last");
        }
        else {
            for (int i = 1; i <= lastInRow; i++) {
                if (i <= numberToSkip) {
                    sumSkip = sumSkip + i;
                } else {
                    sumCount = sumCount + i;
                }
            }
            System.out.println("skipped sum is" + " " + sumSkip);
            System.out.println("counted sum is" + " " + sumCount);
        }
    }
}
