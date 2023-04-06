package com.auction.model;

public interface AuctionSubject {
    void subscribe(AuctionObserver observer);

    void unsubscribe(AuctionObserver observer);

    void notifyObservers();
}
