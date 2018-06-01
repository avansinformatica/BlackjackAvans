import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cardDeck;

    public Deck() {
        this.cardDeck = new ArrayList<Card>();
        addCards();
    }

    public void addCards(){

        String[] strValues = {"Two", "Three", "Four","Five", "Six", "Seven","Eight","Nine", "Ten",
                                "Jack", "Queen", "King", "Ace"} ;
        int[] intValues = {2,3,4,5,6,7,8,9,10,10,10,10,11};

        for (int i = 0; i < strValues.length; i++) {
            for (int j = 0; j < 4; j++) {
                cardDeck.add(new Card(strValues[i], intValues[i]));
            }
        }
    }

    public Card DrawCard(){
        Random random = new Random();
        int randomNumber = random.nextInt(cardDeck.size());
        return cardDeck.get(randomNumber);
    }

    @Override
    public String toString() {
        String text = "";
        for (Card card :cardDeck) {
            text += card.toString() + "\n";
        }
        return text;
    }
}
