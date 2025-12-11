package com.example.blackjack;

import java.util.*;

public class Hand {

    protected final java.util.List<Card> cards = new ArrayList<>();
    protected final String ownerName;

    public Hand() {
        this("Hand");
    }

    public Hand(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addCard(Card card) {
        cards.add(Objects.requireNonNull(card));
    }

    public java.util.List<Card> getCards() {
        return java.util.Collections.unmodifiableList(cards);
    }

    public void clear() {
        cards.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(ownerName).append(": [");
        for (int i = 0; i < cards.size(); i++) {
            sb.append(cards.get(i).toString());
            if (i < cards.size() - 1) sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
