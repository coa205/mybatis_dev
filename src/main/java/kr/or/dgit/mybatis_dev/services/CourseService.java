package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.CourseMapper;
import kr.or.dgit.mybatis_dev.dao.CourseMapperImpl;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class CourseService {
	public List<Course> searchCourse(Map<String, Object> param) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchCourse(param);
		}
	}
	
	public List<Course> searchCaseCourse(Map<String, Object> param) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchCaseCourse(param);
		}
	}
	
	public List<Course> searchWhereCourse(Map<String, Object> param) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchWhereCourse(param);
		}
	}
	
	public List<Course> searchTrimCourse(Map<String, Object> param) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchTrimCourse(param);
		}
	}
	
	public List<Course> searchForeachCourse(Map<String, Object> param) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchForeachCourse(param);
		}
	}
}
