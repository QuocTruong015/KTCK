package com.example.a124lttd01_3q;

public class DanhMuc {
    private int id;

    private String tenDanhMuc;

    private String hinhAnh;

//    private List<SanPham> sanPhams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public DanhMuc(int id, String tenDanhMuc, String hinhAnh) {
        this.id = id;
        this.tenDanhMuc = tenDanhMuc;
        this.hinhAnh = hinhAnh;
    }
}
