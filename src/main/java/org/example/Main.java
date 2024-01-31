package org.example;

import org.example.bracket.BracketChecker;
import org.example.bracket.BracketCheckerFlyweight;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    BracketCheckerFlyweight bracketCheckerFlyweight;

    public Main(BracketCheckerFlyweight bracketCheckerFlyweight) {
        this.bracketCheckerFlyweight = bracketCheckerFlyweight;
    }

    public boolean checkIfExpressionIsRight(String chain) {
        Deque<Character> openedBrackets = new ArrayDeque<>();

        for (char c : chain.toCharArray()) {
            BracketChecker checker = bracketCheckerFlyweight.getBracketChecker(c);
            if (checker.isOpeningBracket(c)) {
                openedBrackets.push(c);
            } else if (checker.isClosingBracket(c)) {
                if (openedBrackets.isEmpty() || openedBrackets.pop() != checker.getOpeningBracket()) {
                    return false;
                }
            }
        }

        return openedBrackets.isEmpty();
    }
}