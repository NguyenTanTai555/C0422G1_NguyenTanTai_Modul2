package model;

public abstract class Persion {
    public String name ;
    public String dateOfBirth;
    public boolean gender ;
    public Persion(){}
    public Persion(String name, String dateOfBirth, boolean gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Persion" +
                "\nname" + name +
                "\ndateOfBirth :" + dateOfBirth +
                "\ngender :" + gender ;
    }
}
