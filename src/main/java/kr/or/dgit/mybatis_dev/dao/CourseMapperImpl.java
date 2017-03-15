package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class CourseMapperImpl implements CourseMapper {
	private String namespace="kr.or.dgit.mybatis_dev.dao.CourseMapper.";
	private static final Log log = LogFactory.getLog(CourseMapperImpl.class);
	private SqlSession sqlSession;
	
	public CourseMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Course> searchCourse(Map<String, Object> param) {
		log.debug("searchCourse()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace+"searchCourse", param);
		}
	}

	@Override
	public List<Course> searchCaseCourse(Map<String, Object> param) {
		log.debug("searchCaseCourse()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace+"searchCaseCourse", param);
		}
	}

	@Override
	public List<Course> searchWhereCourse(Map<String, Object> param) {
		log.debug("searchWhereCourse()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace+"searchWhereCourse", param);
		}
	}

	@Override
	public List<Course> searchTrimCourse(Map<String, Object> param) {
		log.debug("searchTrimCourse()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace+"searchTrimCourse", param);
		}
	}

	@Override
	public List<Course> searchForeachCourse(Map<String, Object> param) {
		log.debug("searchForeachCourse()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace+"searchForeachCourse", param);
		}
	}
}
