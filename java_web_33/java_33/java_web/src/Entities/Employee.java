package Entities;

public class Employee extends Base {
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean save(Object o) {
        return false;
    }

    @Override
    public boolean save(Employee employee) {
        return false;
    }
}
