package classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] languages = new String[]{"JAVA", "GO", "PHP", "JS", "JAVA", "JS", "C#"};
        System.out.println(map(languages));
        Map<String, String> map = new HashMap<>();
        Phone phone = new Phone(map);
        map.put("0773296297", "Aiturgan");
        map.put("0776187254", "Jumagul");
        map.put("0776891230", "Burulay");
        System.out.println(phone);
        while (true) {
            System.out.println("""
                    1. Add contact
                    2. Get contact
                    3. Remove contact
                    4. Get all contact
                    """);
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    System.out.println("Enter phone number: ");
                    String number = new Scanner(System.in).nextLine();
                    System.out.println("Enter name of contact: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println(phone.addContact(number, name));
                }
                case 2 -> {
                    System.out.println("Enter name of contact: ");
                    System.out.println(phone.getContact(new Scanner(System.in).nextLine()));
                }
                case 3 -> {
                    System.out.println("Enter number of contacts: ");
                    String number = new Scanner(System.in).nextLine();
                    System.out.println(phone.removeContact(number));
                }
                case 4 -> {
                    phone.getAllContacts();
                }
            }
        }

    }

    public static Map<String, Integer> map(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int counter = 1;
            if (map.containsKey(words[i])) {
                counter++;
            }
            map.put(words[i], counter);
        }
        return map;
    }
}