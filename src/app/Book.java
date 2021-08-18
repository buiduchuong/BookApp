package app;

public class Book {
    private int maSach;
    private String tenSach, tacGia, NXB;
    private double donGia;
    private int soluong;

    public Book() {
    }

    public Book(int maSach, String tenSach, String tacGia, String nXB, double donGia,int soluong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.NXB = nXB;
        this.donGia = donGia;
        this.soluong = soluong;
    }

    public boolean check(Book book) {
        if (book.getMaSach() == this.maSach && this.tenSach.equals(book.getTenSach())) {
            return true;
        } else {
            return false;
        }
    }

   

    @Override
    public String toString() {
        return "Book [NXB=" + NXB + ", donGia=" + donGia + ", maSach=" + maSach + ", soluong=" + soluong + ", tacGia="
                + tacGia + ", tenSach=" + tenSach + "]";
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
    

}
