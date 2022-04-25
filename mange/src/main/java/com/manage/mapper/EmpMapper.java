package com.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.manage.entity.EmpVO;

@Repository
@Mapper
public interface EmpMapper {
	// 1. 직원목록 이름으로 검색 (이름같게!! / 파라미터사용할경우(괄호안에 꼭 넣기!) / resultType주의해서 사용)
	List<EmpVO> getEmpList(EmpVO empVO);
	
	
	//1-2. 직원목록 수정
	public int updateEmp(EmpVO empVo);
	
	//1-3. 직원목록 삭제
	public int deleteEmp(EmpVO empVO);
}
