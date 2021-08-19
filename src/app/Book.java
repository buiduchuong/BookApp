package app;

import java.util.Date;

public class Book {
    private int maSach;
    private String tenSach, tacGia, nhaXuatBan;
    private Date ngayPhatHanh;
    private double donGia;
    private int soluong;

    public Book() {
    }

    public Book(int maSach, String tenSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
    }

    public Book(int maSach) {
        this.maSach = maSach;
    }

    public Book(int maSach, String tenSach, String tacGia, Date ngayPhatHanh, double donGia, int soluong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.ngayPhatHanh = ngayPhatHanh;
        this.donGia = donGia;
        this.soluong = soluong;

    }

    public boolean check(Book book) {
        if (book.getMaSach() != this.maSach) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Book [donGia=" + donGia + ", maSach=" + maSach + ", ngayPhatHanh=" + ngayPhatHanh + ", nhaXuatBan="
                + nhaXuatBan + ", soluong=" + soluong + ", tacGia=" + tacGia + ", tenSach=" + tenSach + "]";
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

}
