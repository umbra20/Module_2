package Module_2.Les_2;

public abstract class Bird {
    int flySpeed;

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public abstract void fly(); //Название  птиц

    public abstract void makeSound(); // какие звуки издает

    public abstract void flySpeed(); // скорость полета

    /*public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }*/
}

