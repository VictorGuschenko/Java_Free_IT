package task5_3_clothes;

public class Shoes implements IShoes{
    private final String name;

    public Shoes(String name) {
        this.name = name;
    }

    @Override
    public void dressUp() {
        System.out.println(name + " are put on");
    }

    @Override
    public void undress() {
        System.out.println("shoes are taken off");
    }
}
