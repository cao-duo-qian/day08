package com.xiaoshu.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.MajorMapper;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.entity.Major;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentVo;

@Service
public class StudentService {

	@Autowired
	StudentMapper studentMapper;

	@Autowired
	MajorMapper majorMapper;

	public PageInfo<StudentVo> findPage(StudentVo studentVo,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<StudentVo> list = studentMapper.findList(studentVo);
		return new PageInfo<>(list);
	}
	
	public List<Major> findAll(){
		return majorMapper.selectAll();
	}
	
	public Student findByName(String sName){
		Student s = new Student();
		s.setsName(sName);
		return studentMapper.selectOne(s);
		
	}
	public void addStudent(Student student){
		student.setsBirth(new Date());
		studentMapper.insert(student);
	}
	public void updateStudent(Student student){
		studentMapper.updateByPrimaryKeySelective(student);
	}
	public void deleteStudent(Integer sId){
		studentMapper.deleteByPrimaryKey(sId);
	}
	public List<StudentVo> findList(StudentVo studentVo){
		return studentMapper.findList(studentVo);
	}
}