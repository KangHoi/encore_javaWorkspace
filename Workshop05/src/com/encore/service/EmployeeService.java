package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Engineer;

import com.encore.vo.Manager;



public class EmployeeService {
	public static final int MIDX = 10;
	public static final int EGIDX = 10;
	public Manager[] managers;
	public Engineer[] engineers;
	public int numberOfManagers;
	public int numberOfEngineers;
	ArrayList<Manager> managerList;
	
	private EmployeeService(int MIDX) {
		managers =new Manager[MIDX];
		numberOfManagers = 0;
	}
	
	private EmployeeService(int EGIDX) {
		engineers =new Engineer[EGIDX];
		numberOfEngineers = 0;
	}
	

	
	public void addManager(Manager ms)  {
		if(numberOfManagers == MIDX) {
			System.out.println("더 이상 회원을 받을 수 없습니다...");
			return;
		}
		managers[numberOfManagers++] = ms;
	}
	
	public void addEngineer(Engineer egs)  {
		if(numberOfEngineers == EGIDX) {
			System.out.println("더 이상 회원을 받을 수 없습니다...");
			return;
		}
		engineers[numberOfEngineers++] = egs;
	}
	
	public void deleteManager(String dept) {
		
	}
	public void deleteEngineer(String tech) {
			
	}
	public void updateManager(double Salary, String dept, int deptno, String name) {
		Manager manager = new Manager(name, Salary, dept, deptno);
		manager.setSalary(Salary);
		manager.setDept(dept);
		manager.setDeptno(deptno);
		manager.setName(name);
		managerList.add(manager);
		
	}
	public void updateEngineer(Engineer egs) {
		
		
	}
	public Manager findManager(Manager[] m, String name) {
		Manager ma = null;
		for(int i=0;i<m.length; i++) {
			if(m[i].getName().equals(name)) {
				ma = m[i];
				break;
			}
		}
		return ma;
	}
	public Manager findManager(Manager[] m, int deptno) {
		Manager ma = null;
		for(int i=0;i<m.length; i++) {
			if(m[i].getDeptno() == deptno) {
				ma = m[i];
				break;
			}
		}
		return ma;
		
	}
	public Engineer findEngineer(Engineer[] e, String tech) {
		Engineer eg = null;
		for(int i=0;i<e.length; i++) {
			if(e[i].getTech().equals(tech)) {
				eg = e[i];
				break;
			}
		}
		return eg;
		
		
	}
	public void printManagers(Manager[] m) {
		for(int i = 0 ; i<m.length; i++) {
			System.out.println(m[i]);
		}
		
	}
	public void printEngineers(Engineer[] e) {
		for(int i = 0 ; i<e.length; i++) {
			System.out.println(e[i]);
		}
		
	}
}
