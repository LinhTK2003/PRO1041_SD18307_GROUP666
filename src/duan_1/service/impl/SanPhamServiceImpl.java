/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan_1.service.impl;

import duan_1.entity.SanPham;
import duan_1.service.SanPhamService;
import duan_1.utiliti.Utilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class SanPhamServiceImpl implements SanPhamService {

    private static Connection conn = Utilities.getConnection();
    
    @Override
    public ArrayList<SanPham> getAllSanPham() {
        String sql = "SELECT [MaSanPham]\n"
                + "      ,[TenSanPham]\n"
                + "  FROM [dbo].[SanPham]";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String maSanPham = rs.getString(1);
                String tenSanPham = rs.getString(2);
                SanPham sp = new SanPham(maSanPham, tenSanPham);
                list.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
