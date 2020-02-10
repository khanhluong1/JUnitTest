import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GradebookTester {

	GradeBook gradeBook1;
	GradeBook gradeBook2;
	
	@Before
	public void setUp() throws Exception {
	    gradeBook1 = new GradeBook(5); 
		gradeBook2 = new GradeBook(5);
		
		gradeBook1.addScore(90);
		gradeBook1.addScore(80);
		gradeBook2.addScore(99);
		gradeBook2.addScore(100);
		gradeBook2.addScore(100);
	}

	@After
	public void tearDown() throws Exception {
		
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	public void testAddScore() {
		
		assertTrue(gradeBook1.toString().equals("90.0 80.0 "));
		assertTrue(gradeBook2.toString().equals("99.0 100.0 100.0 "));
		assertEquals(gradeBook1.getScoreSize(), 2);
		assertEquals(gradeBook2.getScoreSize(), 3);
	}

	@Test
	public void testSum() {
		
		assertTrue(gradeBook1.sum() == 170);
		assertTrue(gradeBook2.sum() == 299);

	}

	@Test
	public void testMinimum() {

		assertTrue(gradeBook1.minimum() == 80);
		assertTrue(gradeBook2.minimum() == 99);
	}

	@Test
	public void testFinalScore() {
		assertTrue(gradeBook1.finalScore() == 90);
		assertTrue(gradeBook2.finalScore() == 200);
	}

	@Test
	public void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
