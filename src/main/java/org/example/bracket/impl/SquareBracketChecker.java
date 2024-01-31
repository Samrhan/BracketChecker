package org.example.bracket.impl;

import org.example.bracket.BracketChecker;

public class SquareBracketChecker implements BracketChecker {
    public char getOpeningBracket() {
        return '[';
    }

    public char getClosingBracket() {
        return ']';
    }
}
