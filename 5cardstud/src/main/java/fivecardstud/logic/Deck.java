package fivecardstud.logic;

/**
 * Pakka, joka pitää kirjaa käytetyistä korteista.
 */
public class Deck {

    private Card[] deck;
    private int cardsUsed;

    /**
     * Luo 52 korttia sisältävän korttipakan.
     */
    public Deck() {
        deck = new Card[52];
        int i = 0;
        for (int suit = 1; suit < 5; suit++) {
            for (int value = 2; value < 15; value++) {
                deck[i] = new Card(value, suit);
                i++;
            }
        }
        cardsUsed = 0;
    }

    /**
     * Metodi palauttaa kaikki käytetyt kortit pakkaan ja sekoittaa pakan.
     */
    public void shuffle() {
        for (int i = deck.length - 1; i > 0; i--) {
            Card temp = deck[i];
            int random = (int) (Math.random() * (i + 1));
            deck[i] = deck[random];
            deck[random] = temp;
        }
        cardsUsed = 0;
    }

    /**
     * Nostaa kortin pakasta ja nostaa käytettyjen korttien määrää yhdellä.
     *
     * @return kortti pakasta.
     */
    public Card dealCard() {
        cardsUsed++;
        return deck[cardsUsed - 1];
    }

    public Card[] getDeck() {
        return deck;
    }

}
