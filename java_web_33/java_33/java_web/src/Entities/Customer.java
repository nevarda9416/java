package Entities;

public class Customer extends Base {
    private String numberPhone;

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
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
