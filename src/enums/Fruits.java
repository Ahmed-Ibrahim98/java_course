package enums;

public enum Fruits {
    GRAPE(75, 40, "Grape"),
    BANANA(60, 20, "Banana"),
    APPLE(55, 35, "Apple"),
    STRAWBERRY(85, 50, "Strawberry");

    final int levelOfDeliciousness;
    double priceTag;
    final String fruitName;
    Fruits(int levelOfDeliciousness, double priceTag, String fruitName){
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.priceTag = priceTag;
        this.fruitName = fruitName;
    }
    public void makeJuice(){
        System.out.println("Making " + this.fruitName + " juice");
    }
}
