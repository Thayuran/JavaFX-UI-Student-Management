public class Student {

    private String name;
    private int ID;
    private String address;

    public Student() {
    }

    public Student(String name, int ID, String address) {
        this.name = name;
        this.ID = ID;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
