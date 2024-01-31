package org.example;

import org.example.bracket.*;

import java.util.Stack;

public class Main {
    BracketCheckerFlyweight bracketCheckerFlyweight;

    public Main(BracketCheckerFlyweight bracketCheckerFlyweight) {
        this.bracketCheckerFlyweight = bracketCheckerFlyweight;
    }

    public boolean checkIfExpressionIsRight(String chain) {
        Stack<Character> stack = new Stack<>();

        for (char c : chain.toCharArray()) {
            BracketChecker checker = bracketCheckerFlyweight.getBracketChecker(c);
            if (checker.isOpeningBracket(c)) {
                stack.push(c);
            } else if (checker.isClosingBracket(c)) {
                if (stack.isEmpty() || stack.pop() != checker.getOpeningBracket()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}