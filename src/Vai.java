import java.util.Scanner;

public class Vai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập vào năm sinh");
            int namSinh = scanner.nextInt();
            String can = " ";
            String chi = " ";
            if (namSinh == 0){
                break;
            }
            switch (namSinh % 10) {
                case 0:
                    can = "canh";
                    break;
                case 1:
                    can = "Tân";
                    break;
                case 2:
                    can = "Nhâm";
                    break;
                case 3:
                    can = "Quý";
                    break;
                case 4:
                    can = "Giáp";
                    break;
                case 5:
                    can = "Ất";
                    break;
                case 6:
                    can = "Bính";
                    break;
                case 7:
                    can = "Đinh";
                    break;
                case 8:
                    can = "Mậu";
                    break;
                case 9:
                    can = "Kỷ";
                    break;
            }
            switch (namSinh % 12) {
                case 0:
                    chi = "thân";
                    break;
                case 1:
                    chi = "Dậu";
                    break;
                case 2:
                    chi = "tuất";
                    break;
                case 3:
                    chi = "Hợi";
                    break;
                case 4:
                    chi = "Tý";
                    break;
                case 5:
                    chi = "Sửu";
                    break;
                case 6:
                    chi = "Dần";
                    break;
                case 7:
                    chi = "Mão";
                    break;
                case 8:
                    chi = "Thìn";
                    break;
                case 9:
                    chi = "Tị";
                    break;
                case 10:
                    chi = "Ngọ";
                    break;
                case 11:
                    chi = "Mùi";
                    break;

            }
            System.out.println(can + " " + chi);

        }
    }
}
