package Taller_no_6;

// Java program to create a file "friendsContact.txt"
// and add a new contact in the file
 
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
 
class create {
 
    public static void main(String data[])
    {
        if (data.length < 2) {
        System.out.println("Por favor, proporciona un nombre y un número.");
        return;
        }
 
        try {
            String newName = data[0];
            long newNumber = Long.parseLong(data[1]);
            String nameNumberString;
            String name;
            long number;
            int index;
 
            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            while (raf.getFilePointer() < raf.length()) {
                nameNumberString = raf.readLine();

                String[] lineSplit = nameNumberString.split("!");
 
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                if (name.equals(newName) || number == newNumber) {
                    found = true;
                    break;
                }
            }
 
            if (found == false) {

                nameNumberString = newName + "!" + String.valueOf(newNumber);
                      
                raf.writeBytes(nameNumberString);
                
                raf.writeBytes(System.lineSeparator());
 
                System.out.println(" Friend added. ");

                raf.close();
            }
            
            else {
 
                
                raf.close();
 
                System.out.println(" Input name" + " does not exists. ");
            }
        }
 
        catch (IOException ioe) {
 
            System.out.println(ioe);
        }
        catch (NumberFormatException nef) {
 
            System.out.println(nef);
        }
    }
}