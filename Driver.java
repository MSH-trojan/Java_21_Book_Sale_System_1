package book_sale_system;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Book[] e = new Book[100];
        int count = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter book title - quit to stop data entry: ");
        String title = scan.nextLine();
        
        while (!title.equalsIgnoreCase("quit")) {
            System.out.print("Enter author name: ");
            String aut = scan.nextLine(); 
            
            System.out.print("Enter the year of publishing: ");
            int year = scan.nextInt();
            
            System.out.print("Enter the price: ");
            double p = scan.nextDouble();
            
            System.out.print("Is this a paperback? (Y/N): ");
            String type = scan.next();
            
            if (type.equalsIgnoreCase("Y")) {
                e[count++] = new Paperback(title, aut, year, p);
            } else {
                System.out.print("Enter the hardFactor: ");
                double f = scan.nextDouble();
                e[count++] = new HardCopy(title, aut, year, p, f);
            }
            
            scan.nextLine(); // Consume newline
            
            System.out.print("Enter book title - quit to stop data entry: ");
            title = scan.nextLine();
        }

        for (int i = 0; i < count; i++) {
        	System.out.println();
            System.out.println(e[i].toString());
            System.out.println("Price = $" + e[i].getPrice());
            System.out.println();
        }

        for (int i = 0; i < count; i++) {
            if (e[i].getPrice() > 100.0) {
                System.out.println(e[i]);
            }
        }
        
        scan.close();
    }
}

class Book {
    private String title, author;
    private int year;

    public Book(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    public String toString() {
        return title + ", " + author + ", " + year;
    }

    double getPrice() {
        return 0.0;
    }
}

class Paperback extends Book {
    private double price;

    public Paperback(String t, String a, int y, double p) {
        super(t, a, y);
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Paperback: " + super.toString();
    }
}

class HardCopy extends Book {
    private double price, hardFactor;

    public HardCopy(String t, String a, int y, double p, double h) {
        super(t, a, y);
        price = p;
        hardFactor = h;
    }

    public double getPrice() {
        return price * hardFactor;
    }

    public String toString() {
        return "HardCopy: " + super.toString();
    }
}
