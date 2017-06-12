package camila.garcia.user;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String lastName;

    private String email;

    private String pwd;

    public User(String aName, String aLastName, String anEmail, String aPassword) {
        name = aName;
        lastName = aLastName;
        email = anEmail;
        pwd = aPassword;
    }

    public User() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String anEmail) {
        email = anEmail;
    }

    public String getPassword() {
        return pwd;
    }

    public void setPassword(String password) {
        pwd = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getLastName(), user.getLastName()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLastName(), getEmail(), getPassword());
    }
}
