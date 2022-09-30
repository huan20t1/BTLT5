package com.example.phamvanhuan;

public class MonAn {
    private String tenmon;
    private String chitiet;
    private String gia;
    private int hinh;

    public MonAn(String tenmon, String chitiet, String gia, int hinh) {
        this.tenmon = tenmon;
        this.chitiet = chitiet;
        this.gia = gia;
        this.hinh = hinh;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
