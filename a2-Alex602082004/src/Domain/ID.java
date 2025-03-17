package Domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class ID {
    File file = new File("id");
    protected int id;
    static int k = 100;


    public ID() throws FileNotFoundException {
        try (Scanner sc = new Scanner(file)) {
            if (sc.hasNextInt())
                k = sc.nextInt();

        }
        k++;
        id = k;
        try (FileWriter fw = new FileWriter("id", false)) {
            fw.write(String.valueOf(id));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getId() {
        return id;
    }
}



