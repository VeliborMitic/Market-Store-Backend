import model.BronzeCard;
import model.Card;
import model.GoldCard;
import model.Owner;
import model.SilverCard;

import static service.PayDesk.*;

public class MarketStoreApp {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Violeta", "Mitić");
        Card card1 = new BronzeCard(owner1, 0);
        Card card2 = new SilverCard(owner1, 600);
        Card card3 = new GoldCard(owner1, 1500);

        calculateTotal(150, card1);
        calculateTotal(850, card2);
        calculateTotal(1300, card3);
    }
}