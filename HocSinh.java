
package hoctap;
import java.util.Scanner;
public class HocSinh {
    public String hoTen;
    public String lop;
    public double toan;
    public double ly;
    public double hoa;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    
    public double diemTB(){
        double diemTB = (toan+ ly+ hoa)/3;
        return diemTB;
    }
    
    public class HocSinhChuyenToan extends HocSinh{
        @Override
        public double diemTB(){
            double diemTB = (toan*2 + ly + hoa)/4;
            return diemTB;
        }
    }
    
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            HocSinh hs1 = new HocSinh();
            System.out.print("Nhập họ tên học sinh: ");
            hs1.setHoTen(sc.nextLine());
            System.out.print("Nhập lớp: ");
            hs1.setLop(sc.nextLine());

            System.out.print("Nhập điểm toán: ");
            double toan = sc.nextDouble();
            hs1.setToan(toan);

            System.out.print("Nhập điểm lý: ");
            double ly = sc.nextDouble();
            hs1.setLy(ly);

            System.out.print("Nhập điểm hóa: ");
            double hoa = sc.nextDouble();
            hs1.setHoa(hoa);
        
            System.out.println("Điểm trung bình: " + hs1.diemTB());
 
            sc.close();
        }
    }
}
