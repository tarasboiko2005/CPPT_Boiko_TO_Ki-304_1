package ki304_Boiko_lab5; import java.util.Scanner;


public class EquationsApp {
    /**
     *	Method driver
     *	@param args
     */
    public static void main(String[] args) { Equation equation = new Equation(); FileIO fileIO = new FileIO(); double result;
        double fileResult;

        Scanner scanner = new Scanner(System.in); System.out.print("Enter X: ");
        try {
            int x = scanner.nextInt(); result = equation.calculate(x);
            System.out.println("Result is " + result);

            fileIO.writeTxt("textResult.txt", result); fileIO.writeBin("binResult.bin", result);
            fileResult = fileIO.readBin("binResult.bin"); System.out.println("Result from binary file is: " + fileResult);
            fileResult = fileIO.readTxt("textResult.txt"); System.out.println("Result from txt file is: " + fileResult);

        }
        catch (CalcException e) { System.out.println(e.getMessage());
        }
    }
}
