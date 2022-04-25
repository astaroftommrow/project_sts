package com.manage.entity;


import lombok.Builder;
import lombok.Data;


@Data @Builder
public class EmpVO {
	
	private String EMP_ID;
	private String EMP_NM;
	private String DEPT_ID;
	private String DEPT_NM;
	private String EMP_JBGD;
	private String EMP_EML;
	private String EMP_TELNO;
	private String EMP_ADDR;

	
	
}
