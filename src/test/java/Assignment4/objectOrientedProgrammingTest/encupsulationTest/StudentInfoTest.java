package Assignment4.objectOrientedProgrammingTest.encupsulationTest;

import Assignment4.objectOrientedProgramming.encapsulation.StudentInfo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/25.
 */
public class StudentInfoTest
{

    @Test
    public void testStudentInfo() throws Exception
    {
        StudentInfo studentInfo = new StudentInfo();

        studentInfo.setName("Ephraim");
        studentInfo.setAge(16);
        studentInfo.setSubject("TP200");

        Assert.assertEquals(studentInfo.getName(),"Ephraim");
        Assert.assertEquals(studentInfo.getAge(),16);
        Assert.assertEquals(studentInfo.getSubject(),"TP200");


    }
}
