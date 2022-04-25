 
package com.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.manage.entity.DeptVO;

@Repository
@Mapper
public interface DeptMapper {
	//2.부서관련정보검색
	List<DeptVO> getDeptList(DeptVO deptVO);
}
