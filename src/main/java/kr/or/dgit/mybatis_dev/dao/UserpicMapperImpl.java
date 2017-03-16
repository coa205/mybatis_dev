package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.services.UserpicService;

public class UserpicMapperImpl implements UserpicMapper {
	private String namespace = "kr.or.dgit.mybatis_dev.dao.UserpicMapper.";
	private static final Log log = LogFactory.getLog(UserpicService.class);
	private SqlSession sqlSession;
	
	
	public UserpicMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int insertUserPic(UserPic userpic) {
		log.debug("insertUserPic()");
		return sqlSession.insert(namespace+"insertUserPic", userpic);
	}

	@Override
	public UserPic selectUserPicById(int id) {
		log.debug("selectUserPicById()");
		return sqlSession.selectOne(namespace+"selectUserPicById", id);
	}

}
