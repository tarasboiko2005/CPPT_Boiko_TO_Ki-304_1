package ki304_Boiko_lab4;

import ki306.haponova.lab4.Equation;

import java.io.File;
import java.io.FileNotFoundException; import java.io.PrintWriter;
import java.util.Scanner;

public class EquationsApp {
    /**
     *	Method driver
     *	@param args
     */
    public static void main(String[] args) { try {
        System.out.print("Enter file name: "); Scanner in = new Scanner(System.in); String fName = in.nextLine();
        PrintWriter fout = new PrintWriter(new File(fName)); try {
            try {
                Equation equation = new Equation(); System.out.println("Enter X: "); fout.print(equation.calculate(in.nextInt()));
            }
            finally {
                fout.flush();
                fout.close();
            }
        }
        catch (CalcException e) { System.out.println(e.getMessage());

        }
    }
    catch (FileNotFoundException e) {
        System.out.println("Exception reason: Perhaps wrong file path");
    }
    }
}
