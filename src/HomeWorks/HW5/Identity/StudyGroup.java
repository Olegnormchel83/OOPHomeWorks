package HomeWorks.HW5.Identity;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private List<Uchenyk> uchenykList = new ArrayList<>();
    Prepodavatel prep;

    public StudyGroup(Prepodavatel prep, List<Uchenyk> uchenykList) {
        this.uchenykList = uchenykList;
        this.prep = prep;
    }
}
