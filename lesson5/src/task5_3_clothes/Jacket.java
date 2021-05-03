package task5_3_clothes;

public class Jacket implements IJacket{
    private final String name;

    public Jacket(String name) {
        this.name = name;
    }

    @Override
    public void dressUp() {
        System.out.println(name + " is put on");
    }

    @Override
    public void undress() {
        System.out.println("jacket is taken off");
    }
}
