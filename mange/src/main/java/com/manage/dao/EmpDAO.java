package com.manage.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.manage.entity.EmpVO;
import com.manage.service.EmpService;



@Service
public class EmpDAO {
	
	@Autowired
	EmpService empService;
	
	
	// 1. 사원이름으로 검색
	// 괄호안에 이전단게에서 사용할 파라미터 적어주기!
	// result자료형 주의!
	// 다했으면 컨트롤러로 다시 이동!
	public List<EmpVO> getEmpList(EmpVO empVO){
		System.out.println(empService.getEmpList(empVO));
		return empService.getEmpList(empVO);
	}
	
	
	// 2. 사원정보 수정/삭제 페이지
	public List<EmpVO> updateEmp(EmpVO empvo,HttpServletRequest req){
		//리스트를 뿌려줌
//		System.out.println(empService.getEmpList(empvo));
		
		//값을변경해줌
//		empvo.setEMP_NM("EMP_NM");
//		empvo.setEMP_JBGD("EMP_JBGD");
//		empvo.setEMP_TELNO("EMP_TELNO");
//		empvo.setEMP_ADDR("EMP_JBGD");
//		empvo.setDEPT_NM("DEPT_NM");
		
		//값을 출력
//		System.out.println(empvo.getEMP_NM());
//		System.out.println(empvo.getDEPT_NM());
//		System.out.println(empvo.getEMP_JBGD());
//		System.out.println(empvo.getEMP_TELNO());
//		System.out.println(empvo.getEMP_ADDR());
		
		//다시 리스트에 넣어준다
		//System.out.println(empService.getEmpList(empvo));
		
		return empService.getEmpList(empvo);
	}

	
	//2-1.직원목록 수정버튼 클릭
	public int updateEmp(EmpVO empvo){
		return empService.updateEmp(empvo);
		
		
	}
	
	//2-2.직원목록
	public int deleteEmp(EmpVO empVo) {
		return empService.deleteEmp(empVo);
	}
	
}
