package rootprogram;
import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.Test;



public class RootsTest{
	
	public static void main(String args[])
	{
	
	}
	
	public int testdriver(Roots root,String testid)
	{
		int no=root.num_roots();
		double r1=root.first_root();
		double r2=root.second_root();
		System.out.println("There are "+no+ " roots - "+r1+ " and "+r2);
		if(Double.isNaN(r1))
		{ 
			fail(testid+" is failing");
		}
		return no;
	}
	
	@Test
	public void test1() {
		Roots root=new Roots(3.0,4.0,5.0);
		int no = testdriver(root,"Test1");
		assertEquals(0, no);
	}
	
	@Test
	public void test2() {
		
		 Roots root=new Roots(0.0,1.0,1.0);
		 int no = testdriver(root,"Test2");
			assertEquals(0, no);
	}
	
	@Test
	public void test3() {
		
		 Roots root=new Roots(0.0,0.0,5.0);
		 int no = testdriver(root,"Test3");
	     assertEquals(1, no);
			
	}
	
	@Test
	public void test4() {
			 
		 
		 Roots root=new Roots(2.0,4.0,2.0);
		 int no = testdriver(root,"Test4");
			assertEquals(1, no);
	}
	
	@Test
	public void test5() {
			 
		 
		 Roots root=new Roots(1.0,0.0,2.0);
		 int no = testdriver(root,"Test5");
			assertEquals(0, no);
	}
	
	@Test
	public void test6() {
			 
		 
		 Roots root=new Roots(1.0,9.0,2.0);
		 int no = testdriver(root,"Test6");
		 assertEquals(2, no);
	}
	
	@Test
	public void test7() {
			 
		 
		 Roots root=new Roots(-1.0,-5.0,2.0);
		 int no = testdriver(root,"Test7");
			assertEquals(2, no);
	}
	@Test
	public void test8() {
			 
		 
		 Roots root=new Roots(-1.5,-5.0,-3.0);
		 int no = testdriver(root,"Test8");
		 assertEquals(2, no);
	}
	@Test
	public void test9() {
			 
		 
		 Roots root=new Roots(-1.5,9.4,-3.0);
		 int no = testdriver(root,"Test9");
		 assertEquals(2, no);
	}
	
	@Test
	public void test10() {
			 
		 
		 Roots root=new Roots(2,0,0);
		 int no = testdriver(root,"Test10");
		 assertEquals(1, no);
	}
}
