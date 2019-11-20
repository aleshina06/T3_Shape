import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static IShape getShape(String shapeInfo){
        IShape shape = null;
        String[] splitInfo = shapeInfo.split(" ", 2);
        System.out.println(splitInfo[0] + "      " + splitInfo[1]);
        String[] coordinates = splitInfo[1].split(" ");

        if (splitInfo[0].equals("P")){
            shape = new Point();
        }
        else if (splitInfo[0].equals("L")){
            shape = new Line();
        }
        else if (splitInfo[0].equals("T")){
            shape = new Triangle();
        }
        else if (splitInfo[0].equals("S")){
            shape = new Square();
        }
        else{
            System.out.println("Unknown shape.");
        }
        if (shape != null)
            shape.initialize(coordinates);
        return shape;
    }

    private static void readFile(String inputFilePath) throws FileNotFoundException {

        try (Scanner scanner = new Scanner(new File(inputFilePath))) {
            IShape shape;
            double sumOfPerimeters = 0;
            double sumOfSquares = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                shape = getShape(line);
                sumOfPerimeters += shape.calcL();
                sumOfSquares += shape.calcS();
            }
            System.out.println("sumOfSquares: " + sumOfSquares + ' ' + "sumOfPerimeters: " + sumOfPerimeters);
        }
    }

    public static void main(String[] args) {

        String inputFilePath = "C:\\Users\\alesh_000.VAIO\\Documents\\Работа\\Code\\T3_Shape\\src\\Shape";

        try {
            readFile(inputFilePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
