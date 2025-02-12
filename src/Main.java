//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        int numarrays = 3;
        int size = 5;

        int[][] result1 = ThreeWayDisjointImproved.generateSequentialIntArrays(numarrays, size);

        // Displaying the generated arrays
        for (int i = 0; i < result1.length; i++) {
            System.out.print("Array " + (i + 1) + ": ");
            for (int j = 0; j < result1[i].length; j++) {
                System.out.print(result1[i][j] + " ");
            }
            System.out.println();
        }

        long startTime1 = System.nanoTime();
        ThreeWayDisjointImproved.disjoint1(result1[0], result1[1], result1[2]);  // For inputArraySize1
        long duration1 = System.nanoTime() - startTime1;
        System.out.println("Runtime for inputArraySize2: " + duration1 + " ns");

        //IMPROVED BELOW

        int[][] result = ThreeWayDisjoint.generateSequentialIntArrays(numarrays, size);

        // Displaying the generated arrays
        for (int i = 0; i < result.length; i++) {
            System.out.print("Array " + (i + 1) + ": ");
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        long startTime = System.nanoTime();
        ThreeWayDisjoint.disjoint1(result[0], result[1], result[2]);  // For inputArraySize1
        long duration = System.nanoTime() - startTime;
        System.out.println("Runtime for inputArraySize1: " + duration + " ns");
    }

}
