import java.util.Objects;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        if (this.name == null) {
            throw new IllegalArgumentException();
        }
        this.surname = surname;
        if (this.surname == null) {
            throw new IllegalArgumentException();
        }
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (age > 0)
            return true;
        else
            return false;
    }

    public boolean hasAddress() {
        if (address == null)
            return false;
        else
            return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String address) {
        return this.address = address;
    }

    public void happyBirthday() {
        age = age + 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname).setAge(0).setAddress(this.address);
        return personBuilder;
    }

}

