package ru.geekbrains.qa.java2.lesson4.homeWork;

public class Main {

    public static void main(String[] args) {
        doPhoneBook();
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Ra","84564285697");
        phoneBook.addElementPhoneBook("Ra","88963541655");
        phoneBook.addElementPhoneBook("Ra","85742163561");

        phoneBook.addElementPhoneBook("Swarg","811111");
        phoneBook.addElementPhoneBook("Swarg","811111");
        phoneBook.addElementPhoneBook("Swarg","822222   ");
        phoneBook.addElementPhoneBook("Swarg","899  99 9 ");
        phoneBook.addElementPhoneBook("Swarg","8  0  0 000     ");

        System.out.println("Ra: " + phoneBook.getPhonesByName("Ra"));
        System.out.println("Swarg: " + phoneBook.getPhonesByName("Swarg"));
        System.out.println("Nix: " + phoneBook.getPhonesByName("Nix"));
        System.out.println("Bravo: " + phoneBook.getPhonesByName("Bravo"));
        System.out.println("-------------------------------");
        System.out.println("List of one time finding names");
    }

    private static String[] createArrayWords() {
        String [] strings = new String[15];
        strings[0] = "Mama";
        strings[1] = "Papa";
        strings[2] = "Alisa";
        strings[3] = "Maya";
        strings[4] = "Mama";
        strings[5] = "Papa";
        strings[6] = "Kira";
        strings[7] = "Max";
        strings[8] = "Denis";
        strings[9] = "Lara";
        strings[10] = "Janna";
        strings[11] = "Teethless";
        strings[12] = "5pat";
        strings[13] = "Veronica";
        strings[14] = "5pat";
        return strings;
    }


}
