public class Guest {

    private String name;
    private String surname;
    private String email;

    public Guest(String name, String surname, String email) {
        setName(name);
        setSurname(surname);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente: " + getName() + " " + getSurname() + " - Email: " + getEmail();
    }

}
