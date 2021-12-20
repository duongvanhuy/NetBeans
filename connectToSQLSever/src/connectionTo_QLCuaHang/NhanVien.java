/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionTo_QLCuaHang;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author dell
 */
public class NhanVien {
//    MaNV int identity(1,1) primary key,
//	HoTen nvarchar(225),
//	SoDT varchar(15),
//	DiaChi nvarchar(MAX),
//	NgaySinh date,
//	ChucVu int, 
//	Luong decimal default(3000000),
//	ChiNhanh int,
//	NgayTao date,
    private int maNV;
    private String hoTen;
    private String soDienThoai;
    private String diaChi;
    private Date ngaySinh;
    private int chucVu;
    private java.math.BigDecimal luong;
    private int chiNhanh;
    private Date ngayTao;
    
    
    public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(int maNV, String hoTen, String soDienThoai, String diaChi, Date ngaySinh, int chucVu,
			BigDecimal luong, int chiNhanh, Date ngayTao) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.chucVu = chucVu;
		this.luong = luong;
		this.chiNhanh = chiNhanh;
		this.ngayTao = ngayTao;
	}
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getChucVu() {
		return chucVu;
	}
	public void setChucVu(int chucVu) {
		this.chucVu = chucVu;
	}
	public java.math.BigDecimal getLuong() {
		return luong;
	}
	public void setLuong(java.math.BigDecimal luong) {
		this.luong = luong;
	}
	public int getChiNhanh() {
		return chiNhanh;
	}
	public void setChiNhanh(int chiNhanh) {
		this.chiNhanh = chiNhanh;
	}
	public Date getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}
    
    
}
