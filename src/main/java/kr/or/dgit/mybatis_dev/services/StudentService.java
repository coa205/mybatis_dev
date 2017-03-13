package kr.or.dgit.mybatis_dev.services;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final Log log = LogFactory.getLog(StudentService.class);
	private String namespace="kr.or.dgit.mybatis_dev.dao.StudentMapper";
	
	public Student findStudentByNo(Student student){
		log.debug("findStudentByNo()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByNo(student);
		}
	}
	
	public Student findStudentByNoApi(Student student){
		log.debug("findStudentByNoApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.selectOne(namespace+".selectOne", student);
		}
	}
	
	public Student findStudentByNoAnnotation(Student student){
		log.debug("findStudentByNoAnnotation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByNoAnnotation(student);
		}
	}
	
	public List<Student> findStudentByAll(){
		log.debug("findStudentByAll()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAll();
		}
	}
	
	/*public List<Student> findStudentByAllApi(){
		log.debug("findStudentByNoApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			sqlSession.selectOne(namespace+".selectOne");
			return sqlSession.selectOne(namespace+".selectOne");
		}
	}
	
	public List<Student> findStudentByAllAnnotation(){
		log.debug("findStudentByNoApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAll();
		}
	}*/
	
	public int findUpdateStudent(Student student){
		log.debug("findUpdateStudent()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			int res = sqlSession.getMapper(StudentMapper.class).updateStudent(student);
			sqlSession.commit();
			return res;
		}
	}
	
	public int findInsertStudent(Student student){
		log.debug("findInsertStudent()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			int res = sqlSession.getMapper(StudentMapper.class).insertStudent(student);
			sqlSession.commit();
			return res;
		}
	}
	
	public int findDeleteStudent(Student student){
		log.debug("findDeleteStudent()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			int res = sqlSession.getMapper(StudentMapper.class).deleteStudent(student);
			sqlSession.commit();
			return res;
		}
	}
}
