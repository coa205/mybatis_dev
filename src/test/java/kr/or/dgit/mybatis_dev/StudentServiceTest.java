package kr.or.dgit.mybatis_dev;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		studentService = null;
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}

	@Test
	public void atestFindStudentByNo() {
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.findStudentByNo(std);
		Assert.assertNotNull(findStd);
	}

	@Test
	public void btestFindStudentByNoApi(){
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.findStudentByNoApi(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void ctestFindStudentByNoAnnotation(){
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.findStudentByNoAnnotation(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void mtestfindStudentByAll() {
		List<Student> findStd = studentService.findStudentByAll();
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void ntestfindStudentByAllApi() {
		List<Student> findStd = studentService.findStudentByAllApi();
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void otestFindStudentByAllAnnotation(){
		List<Student> findStd = studentService.findStudentByAllAnnotation();
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void dtestfindUpdateStudent() {
		Student std = new Student();
		std.setName("홍자바");
		std.setEmail("hjv@test.com");
		std.setPhone(new PhoneNumber("010","344","1212"));
		std.setDob(new Date());
		std.setStudId(2);
		
		int findStd = studentService.findUpdateStudent(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void etestfindUpdateStudentApi() {
		Student std = new Student();
		std.setName("홍자바");
		std.setEmail("hjv@test.com");
		std.setPhone(new PhoneNumber("010","344","1212"));
		std.setDob(new Date());
		std.setStudId(2);
		
		int findStd = studentService.findUpdateStudentApi(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void ftestfindUpdateStudentAnnotation() {
		Student std = new Student();
		std.setName("홍자바");
		std.setEmail("hjv@test.com");
		std.setPhone(new PhoneNumber("010","344","1212"));
		std.setDob(new Date());
		std.setStudId(2);
		
		int findStd = studentService.findUpdateStudentAnnotation(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void gtestfindInsertStudent() {
		Student std = new Student();
		std.setStudId(3);
		std.setName("김자바");
		std.setEmail("kjv@test.com");
		std.setPhone(new PhoneNumber("010","999","6666"));
		std.setDob(new Date());
		
		int findStd = studentService.findInsertStudent(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void htestfindInsertStudentApi() {
		Student std = new Student();
		std.setStudId(4);
		std.setName("김자바");
		std.setEmail("kjv@test.com");
		std.setPhone(new PhoneNumber("010","999","6666"));
		std.setDob(new Date());
		
		int findStd = studentService.findInsertStudentApi(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void itestfindInsertStudentAnnotation() {
		Student std = new Student();
		std.setStudId(5);
		std.setName("김자바");
		std.setEmail("kjv@test.com");
		std.setPhone(new PhoneNumber("010","999","6666"));
		std.setDob(new Date());
		
		int findStd = studentService.findInsertStudentAnnotation(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void jtestfindDeleteStudent(){
		Student std = new Student();
		std.setStudId(3);
		
		int findStd = studentService.findDeleteStudent(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void ktestfindDeleteStudentApi(){
		Student std = new Student();
		std.setStudId(4);
		
		int findStd = studentService.findDeleteStudentApi(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void ltestfindDeleteStudentAnnotation(){
		Student std = new Student();
		std.setStudId(5);
		
		int findStd = studentService.findDeleteStudentAnnotation(std);
		Assert.assertNotNull(findStd);
	}
}
