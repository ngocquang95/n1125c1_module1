import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // System.in: Tiêu chuẩn để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào điểm: ");
        double score = Double.parseDouble(scanner.nextLine()); // "10"
        // scanner.nextLine(); // loại bỏ hết bộ nhớ đệm
        System.out.print("Nhập vào tên: ");
        String name = scanner.nextLine();

        System.out.println("Tên của bạn: " + name);
        System.out.println("Điểm của bạn: " + score);
    }
}
