package de.das_rsg.cs_workshop.java_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import de.das_rsg.cs_workshop.java_app.entities.Teacher;

@SpringBootTest
public class TeacherTest {
    @Test
    public void testTeacher() {
        Teacher teacher = new Teacher();
        teacher.setFirstName("Kirsten");
        teacher.setLastName("Schreiber");
        teacher.setAcronym("SBK");
        assert teacher.getFirstName().equals("Kirsten");
        assert teacher.getLastName().equals("Schreiber");
        assert teacher.getAcronym().equals("SBK");
    }
}
