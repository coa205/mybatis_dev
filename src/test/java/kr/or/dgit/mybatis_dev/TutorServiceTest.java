package kr.or.dgit.mybatis_dev;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.TutorService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TutorServiceTest {
	private static TutorService tutorService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tutorService = new TutorService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		tutorService = null;
	}
	
	/*@Test
	public void aTestFindTutorById(){
		Tutor tutor = tutorService.findTutorById(1);
		Assert.assertNotNull(tutor);
		System.out.println("testFindTutorById()"+tutor);
		List<Course> courses = tutor.getCourses();
		Assert.assertNotNull(courses);
		for(Course course : courses) {
			Assert.assertNotNull(course);
			System.out.println(course);
		}
	}

	@Test
	public void bTestinsertTutor(){
		Tutor tutor = new Tutor();
		tutor.setTutorId(5);
		tutor.setGender(Gender.FEMALE);
		tutor.setEmail("nojam@test.com");
		tutor.setPhone(new PhoneNumber("010-787-3434"));
		tutor.setName("노자바");
		
		int result = tutorService.insertTutor(tutor);
		Assert.assertNotNull(result);
	}*/
}
