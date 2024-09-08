package Module_2.NestedInner;


public class Car {
    String carBrand; //              марка авто
    int speed;
    double weight;


    public void info() {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        System.out.println("Машина " + carBrand + " |" + " едет со скоростью - " + speed + " |" + " Весом " + weight);
        engine.isRunning();

    }

    private class Engine {  // двигатель
        void isRunning() {                   // работать
            System.out.println("Двигатель машины 1.6");

            class Piston {        // поршень
                void combustion() {        // сгорание
                    System.out.println("Преобразует энергию горения топлива в механическую энергию ");
                }
            }
            Piston piston = new Piston();
            piston.combustion();

            class NewCar {  // статус машины, новая
                void сarShop() {
                    System.out.println("Машина " + " абсолютна новая");
                }
            }
            NewCar newCar = new NewCar();
            newCar.сarShop();

            class UsedCar {
                void used() {
                    System.out.println("Поддержаная машина");
                }
            }
            UsedCar usedCar = new UsedCar();
            usedCar.used();
        }
    }
}


