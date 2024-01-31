package org.example.bracket;

public interface BracketChecker {
    default boolean isOpeningBracket(char c){
        return c == getOpeningBracket();
    }
    default boolean isClosingBracket(char c){
        return c == getClosingBracket();
    }

    char getOpeningBracket();
    char getClosingBracket();
}