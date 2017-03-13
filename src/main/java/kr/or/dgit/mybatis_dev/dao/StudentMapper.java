package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student selectStudentByNo(Student student);
	Student selectStudentByNoApi(Student student);
	
	@Select("select stud_id, name, email, phone, dob from students where stud_id = #{studId}")
	Student selectStudentByNoAnnotation(Student student);
	
	List<Student> selectStudentByAll();
	List<Student> selectStudentByApi();
	@Select("select stud_id, name, email, phone, dob from students")
	List<Student> selectStudentByAnnotation();
	
	int updateStudent(Student student);
	int updateStudentApi(Student student);
	@Update("Update students set name=#{name}, email=#{email}, phone=#{phone}, dob=#{dob} where stud_id = #{studId}")
	int updateStudentAnnotation(Student student);
	
	int insertStudent(Student student);
	int insertStudentApi(Student student);
	@Update("insert into students(stud_id, name, email, phone, dob) values (#{studId}, #{name}, #{email}, #{phone}, #{dob})")
	int insertStudentAnnotation(Student student);
	
	int deleteStudent(Student student);
	int deleteStudentApi(Student student);
	@Update("delete from students where stud_id=#{studId}")
	int deleteStudentAnnotation(Student student);
}
