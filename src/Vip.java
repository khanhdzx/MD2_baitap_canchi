import java.util.Scanner;

public class Vip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam sinh");
        int namSinh = scanner.nextInt();
        String Vipcan = " ";
        String Vipchi = " ";
            switch (namSinh %10) {
                case 0:
                   Vipcan = "canh";
                    break;
                case 1:
                    Vipcan = "tan";
                    break;
                case 2:
                    Vipcan = "nham";
                    break;
                case 3:
                    Vipcan= "quy";
                    break;
                case 4:
                    Vipcan = "giap";
                    break;
                case 5:
                    Vipcan= "at";
                    break;
                case 6:
                    Vipcan = "binh";
                    break;
                case 7:
                    Vipcan= "dinh";
                    break;
                case 8:
                    Vipcan= "mau";
                    break;
                case 9:
                    Vipcan= "ky";
                    break;
            }
            switch (namSinh %12) {
                case 0:
                    Vipchi = " than";
                    break;
                case 1:
                    Vipchi= "dau";
                    break;
                case 2:
                    Vipchi = " tuat";
                    break;
                case 3:
                    Vipchi= "hoi";
                    break;
                case 4:
                   Vipchi= "ty";
                    break;
                case 5:
                   Vipchi= "suu";
                    break;
                case 6:
                    Vipchi="dan";
                    break;
                case 7:
                  Vipchi ="mao";
                    break;
                case 8:
                    Vipchi="thin";
                    break;
                case 9:
                    Vipchi="ti";
                    break;
                case 10:
                    Vipchi="ngo";
                    break;
                case 11:
                    Vipchi = "mui";
                    break;
            }
        System.out.println(Vipcan+" "+Vipchi);
    }
}
