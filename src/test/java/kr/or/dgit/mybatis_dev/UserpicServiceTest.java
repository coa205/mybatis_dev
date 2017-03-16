package kr.or.dgit.mybatis_dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.services.UserpicService;

public class UserpicServiceTest {
	private static UserpicService userpicService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}

	@Test
	public void aTestInsertUserPic(){
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir")+"\\DataFile\\bee.jpg");
		try(InputStream is = new FileInputStream(file);){
			pic = new byte[is.available()];
			is.read(pic);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}
		UserPic userPic = new UserPic(1, "꿀벌", pic, "해바라기 주변의 꿀벌");
		int res = userpicService.insertUserPic(userPic);
		Assert.assertEquals(1, res);
	
	}

	@Test
	public void bTestFindUserPic(){
		
	}
}
