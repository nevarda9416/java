import java.util.Arrays;

public class Car {
    private String code;
    private String name;
    private String color;
    private Integer price;
    private OptionInfo optionInfos[];
    public Car() {
    }

    public Car(String code, String name, String color, Integer price, OptionInfo[] optionInfos) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.price = price;
        this.optionInfos = optionInfos;
    }

    public Car(String code, String name, String color, Integer price) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", optionInfos=" + Arrays.toString(optionInfos) +
                '}' + "\n";
    }

    public OptionInfo[] getOptionInfos() {
        return optionInfos;
    }

    public void setOptionInfos(OptionInfo[] optionInfos) {
        this.optionInfos = optionInfos;
    }
}
