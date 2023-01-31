package sol;

import java.util.Arrays;
import java.util.LinkedList;
import src.FuncList;
import src.IFuncList;

public class AutograderCompatibility {
    /**
     * A class that tests whether your submission meets
     * the specifications of our autograder.
     */

    /**
     * The main method of the autograder compatibility check.
     *  TODO: Uncomment the body of the main method.
     *  (in IntelliJ, you can select all commented lines
     *  and press COMMAND+/ or CONTROL+/)
     *  TODO: Check that code compiles and runs.
     */
    public static void main(String[] args) {
        //-----------------------------
        // ListUtils
        //-----------------------------
//        boolean testMember = ListUtils.member(toFuncList("a", "b"), "a");
//        IFuncList<Integer> testInsert = ListUtils.insert(toFuncList(0), 1);
//        IFuncList<String> testSpell = ListUtils.spellCheck(toFuncList(""));
//        boolean testAllIn = ListUtils.allInRange(toFuncList(0), 0, 0);
//        int testDaysIn = ListUtils.daysInRange(toFuncList(toFuncList(0)), 0, 0);
//        FuncList<Integer> testQuick = ListUtils.quicksort(toFuncList(0, 1, 2));
    }

    private static FuncList toFuncList(Object... args) {
        FuncList funcListBuilder = new FuncList<>();
        for (int i = args.length - 1; i >= 0; i--) {
            funcListBuilder = funcListBuilder.link(args[i]);
        }
        return funcListBuilder;
    }
}
