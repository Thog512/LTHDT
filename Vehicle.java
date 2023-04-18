
package Lab1;

import java.util.Scanner;

public class Vehicle {
    Scanner sc = new Scanner(System.in);
    private String tenChuXe;
    private String loaiXe;
    private int DungTich;
    private double TriGia;
    
    public Vehicle(){
    }
    
    public Vehicle(String tenChuXe, String loaiXe, int DungTich, double TriGia){
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.DungTich = DungTich;
        this.TriGia = TriGia;

    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }

    public double getTriGia() {
        return TriGia;
    }

    public void setTriGia(double TriGia) {
        this.TriGia = TriGia;
    }

    
    public double thuePhaiNop(){
        double thuePhaiNop = 0; 
        if(DungTich < 100){
            thuePhaiNop = (0.01*TriGia);
        }
        if(DungTich >= 100 && DungTich < 200){
            thuePhaiNop = (0.03*TriGia);
        }
        if(DungTich > 200){
            thuePhaiNop = (0.05*TriGia);
        }
        return thuePhaiNop;
    }
    
    public void nhap(){
        System.out.printf("\nNhap ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.printf("\nNhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.printf("\nNhap dung tich xe: ");
        DungTich = sc.nextInt();
        System.out.printf("\nNhap tri gia xe: ");
        TriGia = sc.nextDouble();
    }
    
    public void xuat(){
        System.out.printf("\nTen chu xe la: " +getTenChuXe());
        System.out.printf("\nLoai xe la: " +getLoaiXe());
        System.out.printf("\nDung tich xe la: " +getDungTich());
        System.out.printf("\nTri gia xe la: " +getTriGia());
        System.out.printf("\nThue phai nop la: " +thuePhaiNop());
    }
    
    public static void main(String[] args){
            Vehicle xe1 = new Vehicle();
            Vehicle xe2 = new Vehicle();
            Vehicle xe3 = new Vehicle();
            xe1.nhap();
            xe2.nhap();
            xe3.nhap();
            xe1.xuat();
            xe2.xuat();
            xe3.xuat();
        }
    }
