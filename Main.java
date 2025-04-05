package no.uman;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("We Will find the percentage of a child in Exam");
        Scanner sheet = new Scanner(System.in);
        System.out.println("Enter English Marks out of 100");
        float a = sheet.nextFloat();
        System.out.println("Enter Mathematics Marks out of 100");
        float b = sheet.nextFloat();
        System.out.println("Enter Physics Marks out of 100");
        float c = sheet.nextFloat();
        System.out.println("Enter Biology Marks out of 100");
        float d = sheet.nextFloat();
        System.out.println("Enter Chemistry Marks out of 100");
        float e = sheet.nextFloat();
        float f = ((a+b+c+d+e)/500)*100;
        System.out.println("The Percentage of the child in exam is "+f+" ");


    }

}