package app;

import java.util.Iterator;

public class Book {
    private int maSach;
    private String tenSach, tacGia, NXB;

    public Book() {
    }

    public Book(int maSach, String tenSach, String tacGia, String NXB) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        NXB = NXB;
    }

    public boolean check(Book book) {
        if (book.maSach != this.maSach && this.tenSach.equals(book.tenSach)) {
            return false;
        } else {
            return true;
        }
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

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String nXB) {
        NXB = nXB;
    }

}
