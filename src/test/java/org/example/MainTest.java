package org.example;

import org.example.bracket.BracketCheckerFlyweight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main(new BracketCheckerFlyweight());
    @Test
    public void testValidExpression() {
        assertTrue(main.checkIfExpressionIsRight("()"));
    }

    @Test
    public void testInvalidExpression() {
        assertFalse(main.checkIfExpressionIsRight(")("));
    }

    @Test
    public void testValidExpressionWithBrackets() {
        assertTrue(main.checkIfExpressionIsRight("([])"));
    }

    @Test
    public void testInvalidExpressionWithBrackets() {
        assertFalse(main.checkIfExpressionIsRight("([)]"));
    }

    @Test
    public void testValidComplexExpression(){
        assertTrue(main.checkIfExpressionIsRight("([]{([])})"));
    }

    @Test
    public void testValidWith100Brackets(){
        assertTrue(main.checkIfExpressionIsRight("([]{([])})".repeat(10)));
    }
}