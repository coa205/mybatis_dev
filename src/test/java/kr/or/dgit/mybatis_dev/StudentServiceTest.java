package kr.or.dgit.mybatis_dev;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testFindStudentByNo() {
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.findStudentByNo(std);
		Assert.assertNotNull(findStd);
	}

	@Test
	public void testFindStudentByNoApi(){
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.findStudentByNoApi(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void testFindStudentByNoAnnotation(){
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.findStudentByNoAnnotation(std);
		Assert.assertNotNull(findStd);
	}
	
}
