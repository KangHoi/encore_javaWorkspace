package com.encore.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.encore.service.EmployeeListService;
import com.encore.service.EmployeeMapService;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

/*
 * 1. 인터페이스를 상속받아서 정의
 * 2. 싱글톤
 */
public class EmployeeMapServiceImpl implements EmployeeMapService{
	
	//추가	
	//private ArrayList<Employee> list;
	private Map<String, Employee> map;
	
	static EmployeeMapServiceImpl service = new EmployeeMapServiceImpl();//1.
	private EmployeeMapServiceImpl() {
		map = new HashMap<String,Employee>();
	}//2.
	public static EmployeeMapServiceImpl getInstance() {//3.
		return service;
		
	}

	@Override
	public void addEmployee(Employee e) {
		if(map.containsKey(e.getEmpId())) {//추가하려는 사람이 이미 존재
			System.out.println(e.getName() + "님은 이미 등록되어있습니다.");
			return;
			}else {//추가하려는 사람 존재하지 않음
				map.put(e.getEmpId(),e);
				System.out.println(e.getName() + "님은 등록되셨습니다.");
			}
		}


	@Override
	public void deleteEmployee(String empId) {
		Employee emp = map.remove(empId);
		if(emp == null) {//삭제할 대상 존재하지 않음
			System.out.println("삭제할 대상이 없습니다.");
		}else {
			System.out.println("삭제되셨습니다.");
			
		}
		
	}

	@Override
	public void updateEmployee(Employee e) {
		if(map.containsKey(e.getEmpId())){
			//수정... update(), set()... key유니크한 값은 그대로 두고 나머지를 수정... 나머지 정보로 덮어쓴다
			//동일한 키 값으로 객체를 다시 추가
			map.put(e.getEmpId(),e);
			System.out.println(e.getName() + "님의 정보가 수정되셨습니다.");
		}else {
			System.out.println("수정할 대상이 존재하지 않습니다.");
			return;
		}
	}

	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Employee emp = map.get(key);
			if(emp.getAddr().equals(addr)) temp.add(emp);
		}
		return temp;
		
	}

	@Override
	public ArrayList<Employee> findEmployees() {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Employee emp = map.get(key);
			temp.add(emp);
		}
		return temp;
		
	}

}
