public class Card {

    private String name;
    private int value;

    public Card(String name, int value) {
        this.name = name;
        this.value = value;

    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
