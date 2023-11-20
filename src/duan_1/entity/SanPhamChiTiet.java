/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan_1.entity;

/**
 *
 * @author admin
 */
public class SanPhamChiTiet {
     private int IdSanPhamChiTiet;
    
    private KichThuoc kichThuoc;
    private ChatLieu chatLieu;
    private MauSac mauSac;
    
    private String maSanPham;
    private int soLuong;
    private float giaNhap;
    private float giaBan;


    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(int IdSanPhamChiTiet) {
        this.IdSanPhamChiTiet = IdSanPhamChiTiet;
    }
    

    public SanPhamChiTiet(int IdSanPhamChiTiet, KichThuoc kichThuoc, ChatLieu chatLieu, MauSac mauSac, String maSanPham, int soLuong, float giaNhap, float giaBan) {
        this.IdSanPhamChiTiet = IdSanPhamChiTiet;
        this.kichThuoc = kichThuoc;
        this.chatLieu = chatLieu;
        this.mauSac = mauSac;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public int getIdSanPhamChiTiet() {
        return IdSanPhamChiTiet;
    }

    public void setIdSanPhamChiTiet(int IdSanPhamChiTiet) {
        this.IdSanPhamChiTiet = IdSanPhamChiTiet;
    }

    public KichThuoc getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(KichThuoc kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    

    
}
