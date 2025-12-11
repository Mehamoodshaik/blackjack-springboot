package com.example.blackjack;

public class BlackjackDeck extends Deck {

    public BlackjackDeck() {
        super();
        init();
    }

    private void init() {
        cards.clear();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new BlackjackCard(suit, rank));
            }
        }
        shuffle();
    }

    public void resetAndShuffle() {
        init();
    }
}
