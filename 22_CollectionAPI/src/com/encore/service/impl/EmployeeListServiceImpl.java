package com.encore.service.impl;

import java.util.ArrayList;

import com.encore.service.EmployeeListService;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

/*
 * 1. 인터페이스를 상속받아서 정의
 * 2. 싱글톤
 */
public class EmployeeListServiceImpl implements EmployeeListService{
	
	//추가
	private ArrayList<Employee> list;
	
	private static EmployeeListServiceImpl service = new EmployeeListServiceImpl();//1.
	private EmployeeListServiceImpl() {
		list = new ArrayList<Employee>();
	}//2.
	public static EmployeeListServiceImpl getInstance() {//3.
		return service;
		
	}

	@Override
	public void addEmployee(Employee e) {
		boolean find = false; //flag값 하나 선언
		for(Employee emp : list ) {
			if(emp.getEmpId().equals(e.getEmpId())) {//추가하려는 사람이 이미 존재
				find = true;
				System.out.println(e.getName() + "님은 이미 회원 명단에 존재합니다. ");
				return;
			}
		}//for
		
		if(find == false) { //추가하려는 사람이 리스트에 존재하지 않는다면
			list.add(e);
			System.out.println(e.getName() + "님이 회원으로 가입되셨습니다.");
		}
	}

	@Override
	public void deleteEmployee(String empId) {
		boolean find = false; //flag값 하나 선언
		for(Employee emp : list ) {
			if(emp.getEmpId().equals(empId)) {//삭제하려는 사람이 존재
				find = true;
				System.out.println(emp.getName() + "님을 삭제합니다..");
				list.remove(emp);
				break;
			}
		}//for
		
		if(find == false) System.out.println("삭제하려는 대상이 현 회원 중 존재하지 않습니다.");
	}

	@Override
	public void updateEmployee(Employee e) {
		boolean find = false;
		for(Employee emp : list) {
			if(e.getEmpId().equals(emp.getEmpId())) {//수정하려는 대상이 존재

//				emp.setEmpId(null); // pk 값은 수정의 대상이 되면 안됨. 나머지만 가능
				emp.setName(e.getName());
				emp.setAddr(e.getAddr());
				emp.setSalary(e.getSalary());
				
				if(emp instanceof Manager) {
					((Manager)emp).changeDept(((Manager) e).getDept());
				}
				if(emp instanceof Engineer) {
					((Engineer)emp).changeBonus(((Engineer)e).getBonus());
					((Engineer)emp).changeTech(((Engineer)e).getTech());
				}
			}
			
		}
		
		
	}

	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		for(Employee emp : list) {
			if(emp.getAddr().equals(addr)) 	temp.add(emp);

		}
			return temp;
		}

	@Override
	public void findEmployees() {
		for(Employee e : list) System.out.println(e);
		}

}
