package task5_3_clothes;

public class Person {
    private final String name;
    private final IJacket jacket;
    private final IShoes shoes;
    private final IPants pants;

    public Person(String name, IJacket jacket, IShoes shoes, IPants pants) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.pants = pants;
    }

    public void dressUp() {
        System.out.println(name + " is dressing up");
        pants.dressUp();
        shoes.dressUp();
        jacket.dressUp();
    }

    public void undress() {
        System.out.println(name + " is undressing");
        jacket.undress();
        shoes.undress();
        pants.undress();
    }

    public String getName() {
        return name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public IPants getPants() {
        return pants;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", jacket=" + jacket +
                ", shoes=" + shoes +
                ", pants=" + pants +
                '}';
    }
}
