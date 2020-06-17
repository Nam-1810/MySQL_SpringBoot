package com.poly.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sinhvien")
public class sinhvien {
	@Id
	Integer maSinhVien;
	String tenSinhVien;
	@ManyToOne
	@JoinColumn(name="maChuyenNganh")
	chuyennganh chuyennganh;
	
	public Integer getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(Integer maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public chuyennganh getChuyennganh() {
		return chuyennganh;
	}
	public void setChuyennganh(chuyennganh chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	
	
}
