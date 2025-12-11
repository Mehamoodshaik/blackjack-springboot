package com.example.blackjack;

import java.util.*;

public class Deck {

    protected final java.util.List<Card> cards = new ArrayList<>();

    public Card dealCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No cards left in the deck");
        }
        return cards.remove(cards.size() - 1);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int size() {
        return cards.size();
    }
}
