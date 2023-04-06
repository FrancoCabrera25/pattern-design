package com.auction.model;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionSubject {
    // private auctioneers: Auctioneer[] = [];
    private List<AuctionObserver> observers = new ArrayList<>();
    private String item;
    private double initialPrice;
    private double currentPrice;
    private User owner;
    private AuctionStatusEnum status;
    private User winner;

    public Auction() {
    }

    public Auction(String item, double initialPrice, User owner) {
        this.item = item;
        this.initialPrice = initialPrice;
        this.owner = owner;
        this.status = AuctionStatusEnum.OPEN;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public AuctionStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AuctionStatusEnum status) {
        this.status = status;
    }

    public User getWinner() {
        return winner;
    }

    public void setWinner(User winner) {
        this.winner = winner;
    }

    @Override
    public void subscribe(AuctionObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }

    }

    @Override
    public void unsubscribe(AuctionObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (AuctionObserver observer : observers) {
            observer.update(this);
        }
    }

    public List<AuctionObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<AuctionObserver> observers) {
        this.observers = observers;
    }

}
