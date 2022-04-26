package com.manage.entity;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.Builder;
import lombok.Data;

@EnableAutoConfiguration
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
	private String HB_ID;
	private String HB_NM;
	
	
}
