package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.services.CourseService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseServiceTest {
	private static CourseService courseService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService = new CourseService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService = null;
	}

	@Test 
	public void aTestSearchCourse(){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("tutorId", 1);
		param.put("courseName", "%java%");
		param.put("startDate", "2013-01-01");
		param.put("endDate", "2013-09-01");
		
		List<Course> searchCourse = courseService.searchCourse(param);
		Assert.assertNotNull(searchCourse);
	}
	
	@Test 
	public void bTestSearchCaseCourse(){
		Map<String, Object> param = new HashMap<String, Object>();
		//첫번째 조건일때
		param.put("searchBy", "Tutor");
		param.put("tutorId", 1);
		
		//두번째 조건일때
		param.replace("searchBy", "CourseName");
		param.put("courseName", "%java%");
		
		List<Course> searchCourse = courseService.searchCaseCourse(param);
		Assert.assertNotNull(searchCourse);
	}
	
	@Test 
	public void cTestSearchWhereCourse(){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("tutorId", 1);
		param.put("courseName", "%java%");
		param.put("startDate", "2013-01-01");
		param.put("endDate", "2013-09-01");
		
		List<Course> searchCourse = courseService.searchWhereCourse(param);
		Assert.assertNotNull(searchCourse);
	}
	
	@Test 
	public void dTestSearchTrimCourse(){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("tutorId", 1);
		param.put("courseName", "%java%");
		
		List<Course> searchCourse = courseService.searchTrimCourse(param);
		Assert.assertNotNull(searchCourse);
	}
	
	@Test 
	public void eTestSearchForeachCourse(){
		Map<String, Object> param = null;
		List<Course> searchCourse = courseService.searchForeachCourse(param);
		List<Integer> tutorId = new ArrayList<Integer>();
		tutorId.add(1);
		
		param = new HashMap<String, Object>();
		param.put("tutorIds", tutorId);
		
		searchCourse = courseService.searchForeachCourse(param);
		
		tutorId.add(2);
		searchCourse = courseService.searchForeachCourse(param);
		Assert.assertNotNull(searchCourse);
	}
}
