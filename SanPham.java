
package SanPham;

import java.util.Scanner;

public class SanPham {
    Scanner sc = new Scanner(System.in);
    public String tenSp;
    public double donGia;
    public double giamGia;
    
    public SanPham(String tenSp, double donGia, double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    public void getThueNhapKhau(){     
    }
    
    public void nhap(){
        System.out.printf("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.printf("\nNhap don gia: ");
        donGia = sc.nextInt();
        System.out.printf("\nNhap gia giam: ");
        giamGia = sc.nextDouble();
    }
    
    public void xuat(){
        System.out.printf("\nTen san pham " +getTenSp());
        System.out.printf("\nDon gia la: " +getDonGia());
        System.out.printf("\nGia giam la: " +getGiamGia());

    }
    
}
