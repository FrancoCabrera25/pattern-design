package com.auction.model;

import java.util.ArrayList;
import java.util.List;

import com.auction.observer.Observer;
import com.auction.observer.Subject;

public class Auction implements Subject {
    // private auctioneers: Auctioneer[] = [];
    private List<Observer> observers = new ArrayList<>();
    private String item;
    private Double initialPrice;
    private Double currentPrice;
    private User owner;
    private AuctionStatusEnum status;
    private User winner;
    private User lastBidder;

    public Auction() {
    }

    public Auction(String item, Double initialPrice, User owner) {
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

    public Double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(Double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
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

    public User getLastBidder() {
        return lastBidder;
    }

    public void setLastBidder(User lastBidder) {
        this.lastBidder = lastBidder;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void subscribe(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }

    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void bidUp(Double price, User bidder) {
        this.setCurrentPrice(price);
        this.setLastBidder(bidder);
        this.notifyObservers();
    }
    public void closeAuction(User winner) {
       this.setWinner(winner);
       this.setStatus(AuctionStatusEnum.CLOSE);
       this.notifyObservers();
    }

}
