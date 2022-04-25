package com.manage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.manage.dao.EmpDAO;
import com.manage.entity.EmpVO;
import com.manage.service.EmpService;


@Controller
public class HomeController {
	
	@Autowired
	EmpDAO empDAO;
	EmpService empservice;
	
	// 메인페이지
		// 주소 http://localhost:8028/
		@GetMapping(value = "/home")
		public ModelAndView Home(HttpServletRequest req) {
			//System.out.println("enter");
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("content/home.html");
			return mav;	
		}
		
		
	//1-1.직원탐색 작업
		@GetMapping(value = "/home/search")
		public ModelAndView getEmp(HttpServletRequest req, @Validated EmpVO empVO) throws Exception{
			ModelAndView mav = new ModelAndView();
			
			// 값이 똑바로 불러오는지 확인(아래 두 방법 모두 가능)
			System.out.println(req.getParameter("EMP_NM"));
			System.out.println(empVO.getEMP_NM());
			
			// 다음으로 db에서 데이터를 뽑아오도록 작성해야하는데 
			// mybatis(.xml) > mapper > service > dao 이 순서로 만들기!
			// 반대로 작성도 가능한데 반대로 작성하면 다 만들기 전에는 빨간줄 생기므로...
			
			// 위에서 말한 순서대로 다 작성한 이후 다시 돌아오기
			// html에서 받은 이름값으로 db에서 조회
			List<EmpVO> empVOList = empDAO.getEmpList(empVO);
			
			// 결과데이터를 mav에 저장 - 이래야 html에서 사용가능
			// 저장할 이름은 html에서 사용하는 이름과 같게!
			mav.addObject("empVOList",empVOList);
			
			// 보여질 화면 설정
			mav.setViewName("content/home.html");
			return mav;
		}
	
	//2.직원목록 수정/삭제 페이지 이동
//		@RequestMapping(value = "/home/update")
//		public ModelAndView home(HttpServletRequest req, @ModelAttribute("emdVO") EmpVO emdVO) throws Exception{
//			ModelAndView mav =new ModelAndView();
//			List<EmpVO> empVOList = empDAO.getEmpList(emdVO);
//			mav.addObject("modifyEmp",empVOList);
			
//			mav.setViewName("content/home.html");
//			return mav;
//		}	
		
	//2-1.직원목록 수정버튼 클릭
		@RequestMapping(value = "/home/list/update")
		public ModelAndView updateEmp(HttpServletRequest req, @ModelAttribute @Validated EmpVO emdVO) throws Exception{
			ModelAndView mav =new ModelAndView();
			
			int resultCnt = empDAO.updateEmp(emdVO);
			
			mav.addObject("resultCnt",resultCnt);
			mav.setViewName("content/home.html");
			
			return mav;
		}
		
		
	//2-2. 직원목록 삭제버튼 클릭
		@RequestMapping(value = "/home/list/delete")
		public ModelAndView deleteEmp(HttpServletRequest req, @ModelAttribute @Validated EmpVO emdVO) throws Exception{
			ModelAndView mav =new ModelAndView();
			
			int resultCnt = empDAO.deleteEmp(emdVO);
			
			mav.addObject("resultCnt",resultCnt);
			mav.setViewName("content/home.html");
			
			return mav;
		}	
		
		
		
		
		
	//1-4. 직원 신규등록
		
		
		
		//2.조직도 보여주기
		@GetMapping(value = "/home/dept")
		public ModelAndView getorg(HttpServletRequest req, @Validated EmpVO empVO) throws Exception{
			ModelAndView mav = new ModelAndView();
			
			// 값이 똑바로 불러오는지 확인(아래 두 방법 모두 가능)
			System.out.println(req.getParameter("EMP_NM"));
			System.out.println(empVO.getEMP_NM());
			
			// 다음으로 db에서 데이터를 뽑아오도록 작성해야하는데 
			// mybatis(.xml) > mapper > service > dao 이 순서로 만들기!
			// 반대로 작성도 가능한데 반대로 작성하면 다 만들기 전에는 빨간줄 생기므로...
			
			// 위에서 말한 순서대로 다 작성한 이후 다시 돌아오기
			// html에서 받은 이름값으로 db에서 조회
			List<EmpVO> empVOList = empDAO.getEmpList(empVO);
			
			// 결과데이터를 mav에 저장 - 이래야 html에서 사용가능
			// 저장할 이름은 html에서 사용하는 이름과 같게!
			mav.addObject("empVOList",empVOList);
			
			// 보여질 화면 설정
			mav.setViewName("content/home.html");
			return mav;
		}
		
}
	
	
	
