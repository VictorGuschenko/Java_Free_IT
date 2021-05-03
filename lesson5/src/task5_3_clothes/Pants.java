package task5_3_clothes;

public class Pants implements IPants{
    private final String name;

    public Pants(String name) {
        this.name = name;
    }

    @Override
    public void dressUp() {
        System.out.println(name + " are put on");

    }

    @Override
    public void undress() {
        System.out.println("pants are taken off");
    }
}
