import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng");
        int productAmount = scanner.nextInt();
        Product[] products = new Product[productAmount];
        input(products);
        output(products);
        findProduct(products);
        System.out.println(total(products));

    }

    public static void input(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập thông tin");
            String name = scanner.nextLine();
            String type = scanner.nextLine();
            double price = scanner.nextDouble();
            int code = scanner.nextInt();


            Product product = new Product(code, price, name, type);
            products[i] = product;

        }


    }

    public static void output(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

    }

    public static double total(Product[] products) {
        int total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice() * products[i].getCode();

        }
        return total;

    }

    public static void findProduct(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên muốn tìm");
        String name = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].name.equals(name)) {
                System.out.println(products[i]);
            }
        }
    }
}
