package com.example.blackjack;

public class BlackjackCard extends Card {

    public BlackjackCard(Suit suit, Rank rank) {
        super(suit, rank);
    }

    public int getValue() {
        switch (getRank()) {
            case JACK:
            case QUEEN:
            case KING:
                return 10;
            case ACE:
                return 11; // adjusted to 1 in hand logic if needed
            default:
                return getRank().ordinal() + 2;
        }
    }
}
