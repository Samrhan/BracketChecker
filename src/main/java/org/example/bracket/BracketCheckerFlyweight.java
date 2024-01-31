package org.example.bracket;

import org.example.bracket.impl.CurlyBracketChecker;
import org.example.bracket.impl.RoundBracketChecker;
import org.example.bracket.impl.SquareBracketChecker;

import java.util.HashMap;
import java.util.Map;

public class BracketCheckerFlyweight {
    private final Map<Character, BracketChecker> checkers = new HashMap<>();

    public BracketCheckerFlyweight() {
        addBracketChecker(new RoundBracketChecker());
        addBracketChecker(new SquareBracketChecker());
        addBracketChecker(new CurlyBracketChecker());
    }

    private void addBracketChecker(BracketChecker checker) {
        checkers.put(checker.getOpeningBracket(), checker);
        checkers.put(checker.getClosingBracket(), checker);
    }

    public BracketChecker getBracketChecker(char c) {
        BracketChecker checker = checkers.get(c);
        if (checker == null) {
            throw new IllegalArgumentException("Unknown bracket: " + c);
        }
        return checker;
    }
}