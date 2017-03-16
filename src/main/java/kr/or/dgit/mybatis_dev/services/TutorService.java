package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.TutorMapper;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class TutorService {
	private static final Log log = LogFactory.getLog(TutorService.class);
	
	public Tutor findTutorById(int id){
		log.debug("findTutorById()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(TutorMapper.class).findTutorById(id);
		}
	}
	
	public int insertTutor(Tutor tutor){
		log.debug("insertTutor()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res = sqlSession.getMapper(TutorMapper.class).insertTutor(tutor);
			sqlSession.commit();
			return res;
		}
	}
}
