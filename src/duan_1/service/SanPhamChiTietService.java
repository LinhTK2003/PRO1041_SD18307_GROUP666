/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan_1.service;

import duan_1.entity.SanPhamChiTiet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public interface SanPhamChiTietService {
    public ArrayList<SanPhamChiTiet> getAllSanPhamCT(String maSP);
    
    public void insertSanPhamCT(SanPhamChiTiet spct);

    public void updateSanPhamCT(String id, SanPhamChiTiet spct);

    public void deleteSanPhamCT(String id);
}
