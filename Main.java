import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
                        System.out.print("Mã SV: ");
                        String id = sc.nextLine();
                        System.out.print("Họ tên: ");
                        String name = sc.nextLine();
                        System.out.print("Điểm: ");
                        double score = sc.nextDouble();
                        sc.nextLine();
                        students.add(new Student(id, name, score));
                    }
                    break;

                case 2:
                    System.out.println("===== DANH SÁCH SINH VIÊN =====");
                    for (Student st : students) {
                        System.out.println(st);
                    }
                    break;

                case 3:
                    System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
                    String rank = sc.nextLine();
                    System.out.println("===== KẾT QUẢ TÌM KIẾM =====");
                    for (Student st : students) {
                        if (st.getRank().equalsIgnoreCase(rank)) {
                            System.out.println(st);
                        }
                    }
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);

        sc.close();
    }

}
