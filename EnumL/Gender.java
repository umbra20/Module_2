package Module_2.EnumL;

public enum Gender {
    MALE("Муж"), FEMALE("Жен");
    private final String genderString;


    @Override
    public String toString() {
        return genderString;
    }

    Gender(String genderString) {
        this.genderString = genderString;
    }

}
