package com.auction.model;

public interface AuctionObserver {
    void update(AuctionSubject subject);
}
