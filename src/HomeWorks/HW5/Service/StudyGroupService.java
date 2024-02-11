package HomeWorks.HW5.Service;

import HomeWorks.HW5.Identity.Character;
import HomeWorks.HW5.Identity.Prepodavatel;
import HomeWorks.HW5.Identity.Uchenyk;
import HomeWorks.HW5.Identity.StudyGroup;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService implements IStudyGroupService{
    List<Character> characterList = new ArrayList<>();
    @Override
    public void characterCreate(Character characterToCreate) {
        int countPrep = 0;
        int countUchenyk = 0;

        for (Character character : characterList) {
            if (character instanceof Prepodavatel) {
                countPrep++;
            } else countUchenyk++;
        }
        if (characterToCreate instanceof Prepodavatel) {
            ((Prepodavatel) characterToCreate).setPrepId(countPrep + 1);
        } else if (characterToCreate instanceof Uchenyk) {
            ((Uchenyk) characterToCreate).setUchenykId(countUchenyk + 1);
        }

        characterList.add(characterToCreate);
    }

    @Override
    public void characterRead(Character characterToRead) {
        if (characterToRead instanceof Prepodavatel) {
            System.out.println(characterToRead);
        } else if (characterToRead instanceof Uchenyk) {
            System.out.println(characterToRead);
        }
    }

    @Override
    public StudyGroup studyGroupCreate(Prepodavatel prepodavatel, List<Uchenyk> uchenykList) {
        return new StudyGroup(prepodavatel, uchenykList);
    }

    @Override
    public void studyGroupInfo(Prepodavatel prepodavatel, List<Uchenyk> uchenykList) {
        System.out.println("Преподаватель: \n" + prepodavatel
        + "\nГруппа учеников: ");
        for (Uchenyk uchenyk : uchenykList) {
            System.out.println(uchenyk);
        }
    }

    @Override
    public List<Uchenyk> addUchenykToGroup(List<Uchenyk> uchenykList, Uchenyk uchenyk) {
        uchenykList.add(uchenyk);
        return uchenykList;
    }
}
