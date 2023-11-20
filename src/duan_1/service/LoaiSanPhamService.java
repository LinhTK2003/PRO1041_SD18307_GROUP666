/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan_1.service;

import duan_1.entity.LoaiSanPham;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public interface LoaiSanPhamService {
    public ArrayList<LoaiSanPham> getAllLoaiSanPham();
    
    public void insertLoaiSanPham(LoaiSanPham lsp);

    public void updateLoaiSanPham(int id, LoaiSanPham lsp);

    public void deleteLoaiSanPham(int id);
}
