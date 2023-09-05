import java.util.Date;
public class OptionInfo {
    private Date create;
    private String addressCreate;
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(int temp2) {
        this.amount = amount;
    }

    public OptionInfo() {
    }

    public OptionInfo(Date create, String addressCreate, Integer amount) {
        this.create = create;
        this.addressCreate = addressCreate;
        this.amount = amount;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return "OptionInfo{" +
                "create=" + create +
                ", addressCreate='" + addressCreate + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getAddressCreate() {
        return addressCreate;
    }

    public void setAddressCreate(String addressCreate) {
        this.addressCreate = addressCreate;
    }
}
