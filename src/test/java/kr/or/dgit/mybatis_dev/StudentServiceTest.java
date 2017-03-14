package kr.or.dgit.mybatis_dev;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

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

	///////////////////////////////////////////////////////
	
	@Test 
	public void aTestSelectStudentByNoForResultMap(){
		Student std = new Student();
		std.setStudId(1);
		
		Student selectStudent = studentService.selectStudentByNoForResultMap(std);
		Assert.assertNotNull(selectStudent);
	}
	
	@Test 
	public void bTestSelectStudentByALLForResultMap(){
		List<Student> lists = studentService.selectStudentByAllForResultMap();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
	
	///////////////////////////////////////////////////////
	
	@Test 
	public void cTestSelectStudentByNoForHashMap(){
		Student std = new Student();
		std.setStudId(1);
		
		Map<String, Object> selectStudent = studentService.selectStudentByNoForHashMap(std);
			for(Entry<String, Object> e : selectStudent.entrySet()){
				System.out.printf("key : %s -> value : %s %n", e.getKey(), e.getValue());
			}
		Assert.assertNotNull(selectStudent);
	}
	
	@Test 
	public void dTestSelectStudentByALLForHashMap(){
		List<Map<String, Object>> lists = studentService.selectStudentByAllForHashMap();
		List<Map<String, Object>> emptyList = Collections.emptyList();
		
		for(Map<String, Object> map : lists){
			for(Entry<String, Object> e : map.entrySet()){
				System.out.printf("key : %s -> value : %s %n", e.getKey(), e.getValue());
			}
		}
		Assert.assertNotEquals(emptyList, lists);
	}
	
	@Test 
	public void eTestSelectStudentByNoWithAddress(){
		Student std = new Student();
		std.setStudId(1);
		
		Student selectStudent = studentService.selectStudentByNoWithAddress(std);
		Assert.assertNotNull(selectStudent);
	}
	
	@Test 
	public void fTestSelectStudentByNoAssociationAddress(){
		Student std = new Student();
		std.setStudId(1);
		
		Student selectStudent = studentService.selectStudentByNoAssociationAddress(std);
		Assert.assertNotNull(selectStudent);
	}
}
