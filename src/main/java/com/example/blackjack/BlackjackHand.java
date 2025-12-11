package com.example.blackjack;

public class BlackjackHand extends Hand {

    public BlackjackHand(String ownerName) {
        super(ownerName);
    }

    public int getScore() {
        int score = 0;
        int aceCount = 0;

        for (Card c : cards) {
            BlackjackCard card = (BlackjackCard) c;
            score += card.getValue();
            if (card.getRank() == Card.Rank.ACE) {
                aceCount++;
            }
        }

        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }

        return score;
    }

    public boolean isBusted() {
        return getScore() > 21;
    }

    public boolean isBlackjack() {
        return cards.size() == 2 && getScore() == 21;
    }
}
