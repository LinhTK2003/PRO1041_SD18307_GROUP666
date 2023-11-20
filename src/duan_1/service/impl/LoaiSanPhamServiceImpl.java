/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan_1.service.impl;

import duan_1.entity.LoaiSanPham;
import duan_1.service.LoaiSanPhamService;
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
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService {

    private static Connection conn = Utilities.getConnection();

    @Override
    public ArrayList<LoaiSanPham> getAllLoaiSanPham() {
        String sql = "SELECT [IdLoaiSanPham]\n"
                + "      ,[TenLoaiSanPham]\n"
                + "  FROM [dbo].[LoaiSanPham]";
        ArrayList<LoaiSanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                int idLoaiSanPham = rs.getInt(1);
                String tenLoaiSanPham = rs.getString(2);
                LoaiSanPham lsp = new LoaiSanPham(idLoaiSanPham, tenLoaiSanPham);
                list.add(lsp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void insertLoaiSanPham(LoaiSanPham lsp) {
        String sql = "INSERT INTO [dbo].[LoaiSanPham]\n"
                + "           ([TenLoaiSanPham])\n"
                + "     VALUES\n"
                + "           (?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lsp.getTenLoaiSanPham());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateLoaiSanPham(int id, LoaiSanPham lsp) {
        String sql = "UPDATE [dbo].[LoaiSanPham]\n"
                + "   SET [TenLoaiSanPham] = ?\n"
                + " WHERE IdLoaiSanPham = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lsp.getTenLoaiSanPham());
            ps.setInt(2, id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteLoaiSanPham(int id) {
        String sql = "DELETE FROM [dbo].[LoaiSanPham]\n"
                + "      WHERE IdLoaiSanPham = ?";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
