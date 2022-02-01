package HomeWorkFour;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addElementPhoneBook(String name, String phone) {
        HashSet<String> phones;
        if (phoneBook.containsKey(name)) {
            phones = phoneBook.get(name);
        }
        else {
            phones = new HashSet<>();
        }
        phones.add(phone.replaceAll(" ",""));
        phoneBook.put(name,phones);
    }

    public HashSet<String> getPhonesByName (String name){
        return phoneBook.get(name);
    }

}