import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle.");
        System.out.println("2. Triangle.");
        System.out.println("3. Hexagon.");
        System.out.println("Enter Your Choice:-");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter length:");
                double length=sc.nextDouble();
                System.out.println("Enter height:");
                double height=sc.nextDouble();
                double rectangleArea=length*height;
                double rectanglePerimeter=2*(length*height);
                System.out.println("Area:"+"\s"+rectangleArea);
                System.out.println("Perimeter:"+"\s"+rectanglePerimeter);
                break;
            case 2:
                System.out.println("Enter base:");
                double base=sc.nextDouble();
                System.out.println("Enter height:");
                double Height=sc.nextDouble();
                System.out.println("Enter side1:");
                double side1=sc.nextDouble();
                System.out.println("Enter side2:");
                double side2=sc.nextDouble();
                System.out.println("Enter side3:");
                double side3=sc.nextDouble();
                double triangleArea=0.5*base*Height;
                double trianglePerimeter=side1*side2*side3;
                System.out.println("Area:"+"\s"+triangleArea);
                System.out.println("Perimeter:"+"\s"+trianglePerimeter);

                break;
            case 3:
                System.out.println("Enter side:");
                double side=sc.nextDouble();
                double hexagonArea = (3 * Math.sqrt(3) / 2) * side * side;
                double hexagonPerimeter=6*side;
                System.out.println("Area:"+"\s"+hexagonArea);
                System.out.println("Perimeter:"+"\s"+hexagonPerimeter);
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
    }

}