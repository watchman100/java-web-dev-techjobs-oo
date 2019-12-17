package org.launchcode.techjobs_oo.test;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {

    Job jobTest1 = new Job("bobbing", new Employer("bob co"), new Location("New York"), new PositionType("java"), new CoreCompetency("idk"));
    Job jobTest2 = new Job("billing", new Employer("bill co"), new Location("also New York"), new PositionType("css"), new CoreCompetency("something"));
    Job jobTest3 = new Job("bobbing", new Employer("bob co"), new Location("New York"), new PositionType("java"), new CoreCompetency("idk"));

    @Test
    public void testSettingJobId(){
        assertNotEquals(jobTest1.getId(),jobTest2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(jobTest1.getName(),"bobbing");
        assertEquals(jobTest1.getEmployer().getValue(), "bob co");
        assertEquals(jobTest1.getLocation().getValue(),"New York");
        assertEquals(jobTest1.getPositionType().getValue(), "java");
        assertEquals(jobTest1.getCoreCompetency().getValue(),"idk");
    }
    @Test
    public void testJobsForEquality(){
        assertNotEquals(jobTest1.getId(),jobTest3.getId());
    }
    @Test
    public void toStringTest(){
        assertEquals(jobTest1.toString(),
                "Job { ID: __1__," +
                        "\n NAME: __bobbing__," +
                        "\n EMPLOYER: __bob co__," +
                        "\n LOCATION: __New York__," +
                        "\n POSITION TYPE: __java__," +
                        "\n CORE COMPETENCY: __idk__" +
                        "\n }"
                );
    }
}
