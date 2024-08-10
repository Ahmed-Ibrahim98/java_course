package enums;

public class EnumMain {
    public static void main(String[] arg){
        Fruits fruit = Fruits.STRAWBERRY;
        fruit.priceTag = 40;
        Fruits fruit2 = Fruits.STRAWBERRY;
        System.out.println(fruit.priceTag + " , " + fruit.levelOfDeliciousness);
        System.out.println(fruit2.priceTag + " , " + fruit2.levelOfDeliciousness);
        fruit.makeJuice();
    }
}
