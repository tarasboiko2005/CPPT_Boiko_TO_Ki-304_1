import java.io.*;
import java.util.*;

public class Lab1_Boiko_Ki_304 {

    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадрату: ");
        nRows = in.nextInt();
        in.nextLine();

        System.out.print("\nВведіть символ-заповнювач: ");
        String filler = in.nextLine();

        if (filler.length() != 1) {
            System.out.println(filler.length() == 0 ? "\nНе введено символ заповнювач" : "\nЗабагато символів заповнювачів");
            return;
        }

        char fillChar = filler.charAt(0);
        int halfSize = nRows / 2;

        // Верхня половина квадрата буде пустою
        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < nRows; j++) {
                System.out.print(" ");
                fout.print(" ");
            }
            System.out.println();
            fout.println();
        }

        // Нижня половина квадрата заповнюється трикутником
        int offset = nRows % 2 == 0 ? 1 : 0; // Врахування парного або непарного числа

        for (int i = 0; i < halfSize + 1; i++) {
            for (int j = 0; j < nRows; j++) {
                if (j >= halfSize - i && j <= halfSize + i - offset) {
                    System.out.print(fillChar);
                    fout.print(fillChar);
                } else {
                    System.out.print(" ");
                    fout.print(" ");
                }
            }
            System.out.println();
            fout.println();
        }

        fout.flush();
        fout.close();
    }
}

