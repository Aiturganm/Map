package classwork;

import java.util.Map;
import java.util.Set;

public class Phone {
    private Map<String, String> contacts;

    public Phone(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    public Map<String, String> addContact(String key, String value) {
        contacts.put(key, value);
        return contacts;
    }

    public Map.Entry<String, String> getContact(String name) {
        for (Map.Entry<String, String> entries : contacts.entrySet()) {
            if (entries.getValue().equals(name)) {
                return entries;
            }
        }
        return null;
    }

    public Map<String, String> removeContact(String number) {
        for (Map.Entry<String, String> contact : contacts.entrySet()) {
            if (contact.getKey().equals(number)) {
                contacts.remove(contact.getKey());
                return contacts;
            }
        }
        return null;
    }

    public void getAllContacts() {
        for (String str : contacts.keySet()) {
            System.out.println(contacts.keySet() + " " + contacts.get(str));
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "contacts=" + contacts +
                '}';
    }
}
