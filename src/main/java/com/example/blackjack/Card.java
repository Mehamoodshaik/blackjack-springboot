package com.example.blackjack;

import java.util.*;

public class Card {

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = Objects.requireNonNull(suit);
        this.rank = Objects.requireNonNull(rank);
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        String rankStr;
        switch (rank) {
            case JACK:  rankStr = "J"; break;
            case QUEEN: rankStr = "Q"; break;
            case KING:  rankStr = "K"; break;
            case ACE:   rankStr = "A"; break;
            default:    rankStr = String.valueOf(rank.ordinal() + 2);
        }

        String suitStr;
        switch (suit) {
            case CLUBS:    suitStr = "♣"; break;
            case DIAMONDS: suitStr = "♦"; break;
            case HEARTS:   suitStr = "♥"; break;
            case SPADES:   suitStr = "♠"; break;
            default:       suitStr = suit.name();
        }

        return rankStr + suitStr;
    }
}
