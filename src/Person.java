import java.util.UUID;

public abstract class Person implements Identifiable{
    protected String id;
    protected String name;
    protected String email;

    Person(String name, String email) {
        this.id = UUID.randomUUID().toString().substring(0, 3);

        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
