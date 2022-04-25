package com.manage.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.entity.DeptVO;
import com.manage.service.DeptService;


@Service
public class DeptDAO {
	
	@Autowired
	DeptService deptservice;
	
	public List<DeptVO> deptList(DeptVO deptVO){
		System.out.println(deptservice.getdeptList(deptVO));
		return deptservice.getdeptList(deptVO);
	}	

}
