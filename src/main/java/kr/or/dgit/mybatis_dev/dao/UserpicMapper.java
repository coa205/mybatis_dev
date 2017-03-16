package kr.or.dgit.mybatis_dev.dao;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public interface UserpicMapper {
	int insertUserPic(UserPic userpic);
	UserPic selectUserPicById(int id);
}
