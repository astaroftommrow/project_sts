package com.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.entity.DeptVO;
import com.manage.mapper.DeptMapper;

@Service
public class DeptService {
	
	@Autowired
	public DeptMapper DeptMapper;
	
	public List<DeptVO> getdeptList(DeptVO deptVO){
		return DeptMapper.getDeptList(deptVO);
	}
	
}
