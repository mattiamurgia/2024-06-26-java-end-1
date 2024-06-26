public class Contact {
    private String name;
    private String numberPhone;

    public Contact(String name, String numberPhone) throws Exception {
        setName(name);
        setNumberPhone(numberPhone);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberPhone(String numberPhone) throws Exception {
        if (numberPhone.length() < 5) {
            throw new Exception("Numero troppo corto");
        }
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    // Contact details
    public String getDetails() {
        return "\n" + "Name: " + getName() + " - " + "NumberPhone: " + getNumberPhone() + "\n";
    }

    @Override
    public String toString() {
        return getDetails();
    }

}
