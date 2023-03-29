import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter x");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter y");
            int y = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter z");
            int z = Integer.parseInt(scanner.nextLine());
            if (x < 0 || y < 0 || z < 0){
                throw new IllegalArgumentException("1 trong 3 cạnh không hợp lệ");
            } else if (x+y<z||y+z<x||x+z<y) {
                throw new IllegalArgumentException("Không phải là tam giác");
            }
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
