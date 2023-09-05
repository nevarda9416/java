public class Student {
    private String code;// ma sinh vien
    private String name;// ten sinh vien
    private String address;//Dia chi
    protected int age = 10;//Tuoi
    public String gender = "Nam";


    public Student() {

    }

    public Student(String code, String name, String address) {
        this.code = code;
        this.name = name;
        this.address = address;
    }

    public Student(String code, String name, int age) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String code, String name, String address, int age, String gender) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
