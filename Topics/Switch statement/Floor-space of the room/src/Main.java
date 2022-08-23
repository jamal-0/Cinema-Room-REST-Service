import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomType = scanner.next();

        switch (roomType) {
            case "triangle":
                double a  = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = ((a + b + c) /2);
                double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println(area);
                break;

            case "rectangle":
                double aR  = scanner.nextDouble();
                double bR = scanner.nextDouble();
                double areaR = aR*bR;
                System.out.println(areaR);
                break;

            case "circle":
                double r = scanner.nextDouble();
                double areaC = 3.14*Math.pow(r,2);
                System.out.println(areaC);
                break;


        }


    }
}