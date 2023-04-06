package com.auction;

import com.auction.model.Auction;
import com.auction.model.AuctionStatusEnum;
import com.auction.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User owner = new User("Franco Cabrera");
        User participantOne = new User("Juan Perez");
        User participantTwo = new User("Jose Gomez");
        User participantThree = new User("Diego Gonzalez");
        Auction auction = new Auction("Auto", 5000.00, owner);

        auction.subscribe(participantOne);
        auction.subscribe(participantTwo);
        auction.subscribe(participantThree);

        auction.bidUp(5100.00, participantOne);
        auction.bidUp(5800.00, participantTwo);
        auction.bidUp(6000.00, participantOne);
        auction.bidUp(12000.00, participantThree);
        auction.unsubscribe(participantTwo);
        auction.closeAuction(participantThree);
    }
}
