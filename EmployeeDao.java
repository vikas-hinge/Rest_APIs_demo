package com.sid.SurajInformaticsDemo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sid.SurajInformaticsDemo.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory sf;

	public List<Employee> getAllData() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		return list;

	}

	public String insertData(Employee employee) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(employee);
		tr.commit();
		return "data is inserted successfully....!!";

	}

	public String updateData(int id) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e1 = session.load(Employee.class, id);
		e1.setPercentage("55");
		e1.setQualification("bcs");
		session.update(e1);
		tr.commit();
		return "data is updated successfully.....!!";

	}

	public String deleteData(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e2 = session.load(Employee.class, id);
		session.delete(e2);
		tr.commit();
		return "data is deleted successfully.....!!";
	}

	// ----------------------------------------------------

	public List<Employee> getOnlyBcaEmployee() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("qualification", "BCA"));
		List<Employee> list = criteria.list();
		return list;

	}

	public List<Employee> getEmployeePerceBetw50To80() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.between("percentage", "50", "80"));
		List<Employee> list = criteria.list();
		return list;

	}

}
