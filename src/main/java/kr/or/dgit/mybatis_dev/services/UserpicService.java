package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.UserpicMapper;
import kr.or.dgit.mybatis_dev.dao.UserpicMapperImpl;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class UserpicService {
	public UserPic findUserPic(int id){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			UserpicMapper userPicMapper = new UserpicMapperImpl(sqlSession);
			UserPic userPic = userPicMapper.selectUserPicById(id);
			sqlSession.commit();
			return userPic;
		}
	}
	
	public int insertUserPic(UserPic userpic){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			UserpicMapper userPicMapper = new UserpicMapperImpl(sqlSession);
			int userPic = userPicMapper.insertUserPic(userpic);
			sqlSession.commit();
			return userPic;
		}
	}
}
