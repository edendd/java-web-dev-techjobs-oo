package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest extends Job {

    Job job;


    @Before

    @Test
    public void settingJobId() {

        job = new Job();
        job = new Job();
        assertFalse(job.getId() == job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        job = new Job("product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        if (job instanceof Job) {
            assertEquals("Wrong Name ", job.getName(), "product tester");
            assertEquals("Wrong Employer ", job.getEmployer().getValue(), "ACME");
            assertEquals("Wrong Location ", job.getLocation().getValue(), "Desert");
            assertEquals("Wrong positionType ", job.getPositionType().getValue(), "Quality control");
            assertEquals("Wrong coreCompetency ", job.getCoreCompetency().getValue(), "Persistence");

        }
    }

    @Test
    public void testJobForEquality() {
        job = new Job();
        job = new Job();
        //assertTrue(job.getId() == job.getId());

        assertTrue(getId() != job.getId());


    }
    @Test
    public void toStringTest() {
        String toString = job.toString();

        // assertTrue(toString.contains("\n\nID: " + job.getId()));
        assertTrue(toString.contains( "\nName: " + this.getName()));
        assertTrue(toString.contains("\nEmployer: " + this.getEmployer()));
        assertTrue(toString.contains("\nLocation: " + this.getLocation()));
        assertTrue(toString.contains("\nPosition Type: " + this.getPositionType()));
        assertTrue(toString.contains("\nCore Competency: " + this.getCoreCompetency()));

    }


    @Test
    public void testJobsForEquality() {
        job = new Job();
        job = new Job();

        assertTrue(getId() != getId());
    }
}


