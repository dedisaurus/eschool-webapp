package testng;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.kz.test.model.Student;

public class StudentTest {
	Student student = new Student("Test", 10, 2.0);

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite\n");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest\n");
	}

	@Test
	public void testName() {
		System.out.println("Testing name of the created student ");
		Assert.assertEquals(student.getSname(), "Test");
	}
	
	@Test
	public void testAge() {
		System.out.println("Testing age of the created student ");
		Assert.assertEquals(student.getAge(), 10);
	}
	
	@Test
	public void testGpa() {
		System.out.println("Testing gpa of the created student ");
		Assert.assertEquals(student.getGpa(), 2.0);
	}

}
