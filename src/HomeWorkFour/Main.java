package HomeWorkFour;

public class Main {

    public static void main(String[] args) {
        doPhoneBook();
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Sergei","89004567890");
        phoneBook.addElementPhoneBook("Sergei","89127896050");
        phoneBook.addElementPhoneBook("Sergei","89670049111");

        phoneBook.addElementPhoneBook("Art","888888");
        phoneBook.addElementPhoneBook("Art","888888");
        phoneBook.addElementPhoneBook("Art","888888   ");
        phoneBook.addElementPhoneBook("Art","888  88 8 ");
        phoneBook.addElementPhoneBook("Art","8  8  8 888     ");

        System.out.println("Sergei: " + phoneBook.getPhonesByName("Sergei"));
        System.out.println("Art: " + phoneBook.getPhonesByName("Art"));
        System.out.println("Alex: " + phoneBook.getPhonesByName("Alex"));
        System.out.println("Nikto: " + phoneBook.getPhonesByName("Nikto"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "One";
        strings[1] = "Two";
        strings[2] = "Three";
        strings[3] = "Four";
        strings[4] = "Five";
        strings[5] = "One";
        strings[6] = "Two";
        strings[7] = "Three";
        strings[8] = "Five";
        strings[9] = "Six";
        return strings;
    }

}
