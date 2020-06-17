package com.poly.demo.controller;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poly.demo.entity.sinhvien;

@Transactional
@Controller
public class testController {
	@Autowired
	SessionFactory factory;
	
	@ResponseBody
	@RequestMapping("/test/query")
	public String query()
	{
		Session session = factory.getCurrentSession();
		String hql ="FROM sinhvien";
		TypedQuery<sinhvien> query = session.createQuery(hql, sinhvien.class);
		List<sinhvien> list = query.getResultList();
		
		for(sinhvien SV : list)
		{
			System.out.printf("%s-%s ,", SV.getMaSinhVien(), SV.getTenSinhVien());
		}
		return "ok";
	}
	

}
