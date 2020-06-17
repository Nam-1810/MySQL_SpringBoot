package com.poly.dao;

import java.util.List;

import com.poly.demo.entity.sinhvien;

public interface SinhVienDAO {
	
	List<sinhvien> findAll();
	sinhvien create(sinhvien entity);
	sinhvien findId(sinhvien maSinhVien);
	void update(sinhvien entity);
	sinhvien delete(sinhvien maSinhVien );
	

}
