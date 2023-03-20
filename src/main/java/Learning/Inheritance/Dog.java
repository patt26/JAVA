package Learning.Inheritance;

public class Dog extends Animal{
    public Dog(String name, int legs, String type, String overall) {
        super(name, legs, type, overall);


    }



    @Override
    public void eat(){
        System.out.println("Dog eat");
        dance();
    }
    private void dance(){
        System.out.println("Dance");
    }


}
