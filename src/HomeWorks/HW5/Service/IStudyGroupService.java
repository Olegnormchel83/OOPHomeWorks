package HomeWorks.HW5.Service;

import HomeWorks.HW5.Identity.Character;
import HomeWorks.HW5.Identity.Prepodavatel;
import HomeWorks.HW5.Identity.Uchenyk;
import HomeWorks.HW5.Identity.StudyGroup;

import java.util.List;

public interface IStudyGroupService {
    void characterCreate(Character characterToCreate);
    void characterRead(Character characterToRead);
    StudyGroup studyGroupCreate(Prepodavatel prepodavatel, List<Uchenyk> uchenykList);
    void studyGroupInfo(Prepodavatel prepodavatel, List<Uchenyk> uchenykList);

    List<Uchenyk> addUchenykToGroup(List<Uchenyk> uchenykList, Uchenyk uchenyk);
}
