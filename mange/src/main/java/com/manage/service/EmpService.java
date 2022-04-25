package com.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.manage.entity.EmpVO;
import com.manage.mapper.EmpMapper;

@Service
public class EmpService {
	
	
	@Autowired
	public EmpMapper EmpMapper;
	
	// 1. 사원이름으로 검색 + 2.사원정보 수정(modifyEmp) + 3.사원정보 삭제하기 + 4. 사원 신규등록
		// 파라미터 넣어주기
		// 이전단계 인터페이스의 결과값 자료형 주의
		// 다 작성했으면 dao로 이동

	public List<EmpVO> getEmpList(EmpVO empVO){
		return EmpMapper.getEmpList(empVO);
	}	
	

	public int updateEmp(EmpVO empVO){
		return EmpMapper.updateEmp(empVO);
	}	

	public int deleteEmp(EmpVO empVO) {
		return EmpMapper.deleteEmp(empVO);
	}
}
