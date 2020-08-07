package com.xiaoshu.dao;

import java.util.List;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentVo;

public interface StudentMapper extends BaseMapper<Student> {
	public List<StudentVo> findList(StudentVo studentVo);
}