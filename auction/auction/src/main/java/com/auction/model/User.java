package com.auction.model;

import com.auction.observer.Observer;
import com.auction.observer.Subject;

public class User implements Observer {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        Auction auction = new Auction();
        if (subject instanceof Auction) {
            auction = (Auction) subject;
        }
        System.out.println("El usuario " + this.getName() + "Informado del estado de la subasta ");

        if (auction.getStatus() == AuctionStatusEnum.CANCEL) {
            System.out.println("La subasta ha sido cancelada por " + auction.getOwner().getName());
        } else if (auction.getStatus() == AuctionStatusEnum.CLOSE) {
            System.out.println("La subasta finalizado con un ganador " + auction.getWinner().getName() +
                    "El precio final fue de " + auction.getCurrentPrice());
        } else {
            System.out.println("Estado de la Subasta" +
                    "Precio Actual: " + auction.getCurrentPrice() + "Ultimo Usuario en ofertar: "
                    + auction.getLastBidder()
                    + "estado de la subasta " + auction.getStatus());
        }

    }

}
