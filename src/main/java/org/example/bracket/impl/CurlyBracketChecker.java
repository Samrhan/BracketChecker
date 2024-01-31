package org.example.bracket.impl;

import org.example.bracket.BracketChecker;

public class CurlyBracketChecker implements BracketChecker {
    public char getOpeningBracket() {
        return '{';
    }

    public char getClosingBracket() {
        return '}';
    }
}
