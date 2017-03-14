package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final Log log = LogFactory.getLog(StudentService.class);
	private String namespace="kr.or.dgit.mybatis_dev.dao.StudentMapper";
	
	public Student selectStudentByNoForResultMap(Student student){
		log.debug("selectStudentByNoForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoForResultMap", student);
		}
	}
	
	public Student selectStudentByNoAssociationAddress(Student student){
		log.debug("selectStudentByNoAssociationAddress()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoAssociationAddress", student);
		}
	}
	
	public List<Student> selectStudentByAllForResultMap(){
		log.debug("selectStudentByNoForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
		}
	}
	
	public Map<String, Object> selectStudentByNoForHashMap(Student student){
		log.debug("selectStudentByNoForHashMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoForHashMap", student);
		}
	}
	
	public List<Map<String, Object>> selectStudentByAllForHashMap(){
		log.debug("selectStudentByAllForHashMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace+".selectStudentByAllForHashMap");
		}
	}
	
	public Student selectStudentByNoWithAddress(Student student){
		log.debug("selectStudentByNoWithAddress()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoWithAddress", student);
		}
	}
}
