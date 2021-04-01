package task5_3_clothes;

/**
 * Интерфейсы:
 * - Куртка
 * - Штаны
 * - Обувь
 * в каждом интерфейсе есть 2 метода (надеть и снять)
 * Делаем несколько реализации каждого интерфейса.
 * Создаём класс человек:
 * У человека поля:
 * -имя
 * -куртка
 * -штаны
 * -обувь
 * У человека есть 2 метода:
 * - одеться(вызываются методы надеть у всех вещей)
 * - раздеться (вызываются методы снять у всех вещей)
 */
public class HumanDressUpUndressRunner {
    public static void main(String[] args) {
        Person person = new Person("Andrew", new Jacket("WinterJacket"), new Shoes("Boots"), new Pants("Jeans"));
        System.out.println(person);
        person.dressUp();
    }
}
