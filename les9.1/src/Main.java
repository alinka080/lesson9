public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster();
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish();
        fish.sleep();

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }
}
abstract class  Pet {
    protected int pawsCount;
    protected Pet(int pawsCount){
        this.pawsCount = pawsCount;
    }
    public int getPawsCount() {
        return pawsCount;
    }
    public void sleep() {
        System.out.println("сплю");
    }
    public void play() {
        System.out.println("играю");
    }
    public abstract void giveVoice();

}
class Fish extends Pet{
    protected Fish() {
        super(0);
    }
    @Override
    public void giveVoice() {
        System.out.println("буль");
    }
}
class Spider extends Pet{
    protected Spider() {
        super(8);
    }
    @Override
    public void giveVoice() {
        System.out.println("пшш");
    }
}
class Dog extends Pet{
    protected Dog() {
        super(4);
    }
    @Override
    public void giveVoice() {
        System.out.println("гавв");
    }
    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
class Cat extends Pet{
    protected Cat() {
        super(4);
    }
    @Override
    public void giveVoice() {
        System.out.println("мяу");
    }
    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

}
class Hamster extends Pet{
    protected Hamster() {
        super(4);
    }
    @Override
    public void giveVoice() {
        System.out.println("ххх");
    }
    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
}