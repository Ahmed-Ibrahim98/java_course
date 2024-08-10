package generics;

public class RaiseAnimal <T extends Animal>{
    private T animalToRaise;
    public RaiseAnimal(T animalToRaise) {
        this.animalToRaise = animalToRaise;
    }
    public void raiseAnimal(){
        animalToRaise.eat();
        animalToRaise.drink();
        animalToRaise.sleep();
        animalToRaise.isOverridden();
    }
}
