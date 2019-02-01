import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        this.person = new Person( 40, "Henry");
    }

    @Test
    public void getAge() {
        assertEquals(40, this.person.getAge());
    }

    @Test
    public void setAge() {
        this.person.setAge(30);

        assertEquals(30, this.person.getAge());

    }

    @Test
    public void getName() {
        fail();
    }

    @Test
    public void setName() {
        this.person.setName("Harry");

        assertEquals("Harry", this.person.getName());
    }
}