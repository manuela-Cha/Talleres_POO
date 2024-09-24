package Taller_no_6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class read {

    public static void main(String[] args) {
        try {
            File file = new File("friendsContact.txt");

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("New file created: friendsContact.txt");
                return;
            }

            try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
                System.out.println("Friend Contacts:");
                System.out.println("----------------");

                while (raf.getFilePointer() < raf.length()) {
                    String nameNumberString = raf.readLine();
                    String[] lineSplit = nameNumberString.split("!");

                    if (lineSplit.length == 2) {
                        String name = lineSplit[0];
                        long number = Long.parseLong(lineSplit[1]);

                        System.out.println("Friend Name: " + name);
                        System.out.println("Contact Number: " + number);
                        System.out.println("----------------");
                    } else {
                        System.out.println("Invalid entry: " + nameNumberString);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("An error occurred while parsing a number: " + e.getMessage());
        }
    }
}