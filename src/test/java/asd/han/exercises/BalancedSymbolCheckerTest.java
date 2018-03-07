package asd.han.exercises;

import org.junit.Before;
import org.junit.Test;

public class BalancedSymbolCheckerTest {
    BalancedSymbolChecker checker;

    @Before
    public void makeChecker(){
        checker = new BalancedSymbolChecker();
    }

    @Test
    public void testCheckBalancedSymbols() throws Exception {
        checker.checkBalancedSymbols(
                "Stijn{" +
                        "leeftijd=(22)," +
                        "geslacht=(man)," +
                        "hobbies=[" +
                        "{naam=(Gamen)}, " +
                        "{naam=(Series)}" +
                        "]" +
                        "}");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckBalancedSymbolsMissing() throws Exception {
        checker.checkBalancedSymbols("(ab");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckBalancedSymbolsMixedUp() throws Exception {
        checker.checkBalancedSymbols("(ab[)]");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckBalancedSymbolsWrong() throws Exception {
        checker.checkBalancedSymbols("(ab}");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckBalancedSymbolsBigText() throws Exception {
        checker.checkBalancedSymbols("Sijmen{" +
                "leeftijd=(18)," +
                "geslacht=(man)," +
                "hobbies=[" +
                "{naam=(programmeren)}, " +
                "naam=(filmskijken)}" +
                "]" +
                "}");
    }
}