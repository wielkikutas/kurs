package zadankazdupy.nowazdupyklasa.klasazadnkojeszczeraztosamo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JobApplicationServiceTest {
    private JobApplicationService jobApplicationService;
    private List<JobApplication> jobApplications;

    @BeforeEach
    void setUp() {
        jobApplicationService = new JobApplicationService();
        jobApplications = new ArrayList<>();

        jobApplications.add(new JobApplication("dupa",123,"Stalowa",882711559,true,
                "zbydniowiak4@gmail.com",0,List.of("Java", "Chuj")));
        jobApplications.add(new JobApplication("chuj",2345,"Rzeszow",510963836,false,
                "jessica00je@gmail.com",1,List.of("Java", "cipa")));

    }

    @Test
    public void getCitiesCountTestCorrect(){
        //given
        Map<String,Integer> expected= Map.of(
                "Stalowa", 1,
                "Rzeszow", 1
        );
        //when
        Map<String,Integer> actual = jobApplicationService.getCitiesCount(jobApplications);
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getEmailsCountTestCorrect(){
        //given
        Map<String, Long> expected = Map.of(
                "zbydniowiak4@gmail.com",1L,
                "jessica00je@gmail.com",1L
        );
        //when
        Map<String, Long> actual = jobApplicationService.getEmailsCount(jobApplications);
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getMostFreqSkillTestCorrect(){
        String expected="Java";
        String actual = jobApplicationService.getMostFreqSkill(jobApplications);
        Assertions.assertEquals(expected,actual);
    }
}
