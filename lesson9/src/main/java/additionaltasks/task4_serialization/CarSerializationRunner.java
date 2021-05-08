package additionaltasks.task4_serialization;

import java.io.*;

/**
 * Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
 * сериализации произвести обратный процесс.
 */
public class CarSerializationRunner {
    public static void main(String[] args) {
        Car myCar = new Car("Audi", 2021, "Black");
        System.out.println(myCar);
        try (ObjectOutputStream objCarSerial = new ObjectOutputStream(
                new FileOutputStream("src/main/java/additionaltasks/task4_serialization/serial"))) {

            objCarSerial.writeObject(myCar);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream objCarDeSerial = new ObjectInputStream(
                new FileInputStream("src/main/java/additionaltasks/task4_serialization/serial"))) {
            Car myNewCar = (Car) objCarDeSerial.readObject();
            System.out.println(myNewCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
