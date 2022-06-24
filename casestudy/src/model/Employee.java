package model;

public class Employee extends Persion {
    private String idEmployee;
    int idCard;
    private String numberPhone;
    private String email;
    private String level;
    private String position;
    private double wage;

    public Employee(String idEmployee, int idCard, String numberPhone, String email, String level, String position, double wage) {
        this.idEmployee = idEmployee;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public Employee(String name, String dateOfBirth, boolean gender, String idEmployee, int idCard, String numberPhone, String email, String level, String position, double wage) {
        super(name, dateOfBirth, gender);
        this.idEmployee = idEmployee;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public Employee() {
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee" + super.toString() +
                "\nidEmployee :" + idEmployee +
                "\nidCard :" + idCard +
                "\nnumberPhone :" + numberPhone +
                "\nemail :" + email +
                "\nlevel :" + level +
                "\nposition :" + position + "\nwage :" + wage;
    }
}
