package kitten;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class KittenTest {
	Kitten kitten=null;
	@Before
	public void setUp() throws Exception {
		kitten=new Kitten();
	}

	@Test
	public void test1() {
		Person p=new Person("Feline");
		assertEquals("tommy the Feline",kitten.name("tommy"));
	}
	@Test
	public void test2() {
		new Person("Feline");
		kitten.name("puppy");
		kitten.haveBirthday();
		assertEquals("puppy the Feline is 1 and belongs to Feline",kitten.toString());
	}
	

}
