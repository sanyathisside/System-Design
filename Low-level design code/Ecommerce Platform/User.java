
import java.util.ArrayList;

public abstract class User {
    private int id;
    private String name;
    private String Address;
    private String username;
    private String password;
    private String phone;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return phone;
    }

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + ''' +
                ", phone='" + phone + ''' +
                '}';
    }
}

