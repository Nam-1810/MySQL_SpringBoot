package com.poly.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="chuyennganh")
public class chuyennganh {
	@Id
	Integer maChuyenNganh;
	@OneToMany(mappedBy = "chuyennganh")
	List<sinhvien> sinhvien;
	
	public Integer getMaChuyenNganh() {
		return maChuyenNganh;
	}
	public void setMaChuyenNganh(Integer maChuyenNganh) {
		this.maChuyenNganh = maChuyenNganh;
	}
	public List<sinhvien> getSinhvien() {
		return sinhvien;
	}
	public void setSinhvien(List<sinhvien> sinhvien) {
		this.sinhvien = sinhvien;
	}
}
