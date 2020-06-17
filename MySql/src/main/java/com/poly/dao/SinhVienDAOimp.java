package com.poly.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.poly.demo.entity.sinhvien;

public class SinhVienDAOimp implements SinhVienDAO {
	@Autowired
	SessionFactory factory;

	@Override
	public List<sinhvien> findAll() {
		Session session = factory.getCurrentSession();
		String hql = " From sinhvien";
		TypedQuery<sinhvien> query = session.createQuery(hql, sinhvien.class);
		return query.getResultList();
	}

	@Override
	public sinhvien findId(sinhvien maSinhVien) {
		Session session = factory.getCurrentSession();
		return session.find(sinhvien.class, maSinhVien);
	}

	@Override
	public sinhvien create(sinhvien entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;
	}

	@Override
	public void update(sinhvien entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
		return;

	}

	@Override
	public sinhvien delete(sinhvien maSinhVien) {
		Session session = factory.getCurrentSession();
		sinhvien entity = findId(maSinhVien);
		session.delete(entity);
		return entity;
	}

}
