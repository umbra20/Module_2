package Module_2.EnumL;


public class Person {
    String name;
    int age;
    private final Gender gender;



    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public Gender getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return name + ":  Возраст - " + age + "; Пол: " + gender + "\n";
    }

}

