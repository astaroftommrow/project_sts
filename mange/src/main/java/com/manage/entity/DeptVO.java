package com.manage.entity;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class DeptVO {
	private String DETP_ID;
	private String DETP_NM;
	private String UP_DEPT_ID;
	private String EMP_ID;
	private String EMP_NM;
	
}
