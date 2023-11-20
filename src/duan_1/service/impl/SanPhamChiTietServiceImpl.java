package duan_1.service.impl;

import duan_1.entity.SanPhamChiTiet;
import duan_1.utiliti.Utilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import duan_1.service.SanPhamChiTietService;

/**
 *
 * @author admin
 */
public class SanPhamChiTietServiceImpl implements SanPhamChiTietService {

    private static Connection conn = Utilities.getConnection();

    @Override
    public ArrayList<SanPhamChiTiet> getAllSanPhamCT(String maSP) {
        String sql = "SELECT [IdSanPhamChiTiet]\n"
                + "      ,[IdKichThuoc]\n"
                + "      ,[IdChatLieu]\n"
                + "      ,[IdMauSac]\n"
                + "      ,[IdLoaiSanPham]\n"
                + "      ,SanPham.[MaSanPham]\n"
                + "      ,[TenSanPham]\n"
                + "      ,[SoLuong]\n"
                + "      ,[GiaNhap]\n"
                + "      ,[GiaBan]\n"
                + "  FROM [dbo].[SanPhamChiTiet]\n"
                + "  JOIN SanPham ON SanPhamChiTiet.MaSanPham = SanPham.MaSanPham \n"
                + "                WHERE SanPhamChiTiet.MaSanPham = ?";

        ArrayList<SanPhamChiTiet> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maSP);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idSanPhamCT = rs.getInt("IdSanPhamChiTiet");
                int idKichThuoc = rs.getInt("IdKichThuoc");
                int idChatLieu = rs.getInt("IdChatLieu");
                int idMauSac = rs.getInt("IdMauSac");
                int idLoaiSanPham = rs.getInt("IdLoaiSanPham");
                String maSanPham = rs.getString("MaSanPham");
                String tenSanPham = rs.getString("TenSanPham");
                int soLuong = rs.getInt("SoLuong");
                float giaNhap = rs.getFloat("GiaNhap");
                float giaBan = rs.getFloat("GiaBan");
              //  SanPhamChiTiet ms = new SanPhamChiTiet(idSanPhamCT, idKichThuoc, idChatLieu, idMauSac, idLoaiSanPham, maSanPham, tenSanPham, soLuong, giaNhap, giaBan);
               // list.add(ms);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void insertSanPhamCT(SanPhamChiTiet spct) {
    }

    @Override
    public void updateSanPhamCT(String id, SanPhamChiTiet spct) {
    }

    @Override
    public void deleteSanPhamCT(String id) {
    }

}
