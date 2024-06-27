import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PhoneBook {

    private List<Contact> contacts;

    public PhoneBook() {
        setContacts(new ArrayList<Contact>());
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    // Method for adding contacts
    public void addContact(Contact contact) {
        getContacts().add(contact);
    }

    // Method for removing the contact
    public void removeContact(Contact contact) {
        getContacts().remove(contact);
    }

    // Method for searching the contact by name es: 'Alessio'
    public Contact findContact(String contact) throws NoSuchElementException {
        for (Contact c : this.contacts) {
            if (contact.toLowerCase().equals(c.getName().toLowerCase())) {
                return c;
            }
        }
        throw new NoSuchElementException("Contatto non trovato");
    }

    // Phone Book details
    public String getDetails() {
        return "Contact: " + getContacts();
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
