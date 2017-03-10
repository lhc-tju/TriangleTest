package lab1;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;  
import static org.junit.Assert.*;  
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.After;
import org.junit.Before;
  
import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.core.CombinableMatcher;  

@RunWith(Parameterized.class)
public class TriangleTest {
	private int a;
	private int b;
	private int c;
	private int expected;
	
	private Triangle triangle;
	
	public TriangleTest(int expected,int a, int b,int c)
	{
		this.expected = expected;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle();
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]
				{
					{1,3,3,3},
					{1,5,5,5},
					{1,7,7,7},
					{2,5,5,3},
					{2,4,4,3},
					{2,6,6,9},
					{3,9,6,7},
					{3,4,5,6},
					{3,7,8,9},
					{-1,0,1,2},
					{-1,-1,2,3},
					{-1,3,4,7}
				});	
	}
	
	@Test
	public void testGetTriangleKind() {
		assertEquals(this.expected,triangle.getTriangleKind(a, b, c));
	}

	
}
