import java.util.Date;
public class OptionInfo {
    private Date create;
    private String addressCreate;

    public OptionInfo() {
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
                '}' + "\n";
    }

    public String getAddressCreate() {
        return addressCreate;
    }

    public void setAddressCreate(String addressCreate) {
        this.addressCreate = addressCreate;
    }
}
