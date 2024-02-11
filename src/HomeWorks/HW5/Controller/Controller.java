package HomeWorks.HW5.Controller;

import HomeWorks.HW5.Identity.Character;
import HomeWorks.HW5.Identity.Prepodavatel;
import HomeWorks.HW5.Identity.Uchenyk;
import HomeWorks.HW5.Service.StudyGroupService;
import HomeWorks.HW5.View.CharacterView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Controller {
    StudyGroupService _studyGroupService;
    CharacterView _viewer;
    public Controller() {
        _viewer = new CharacterView();
        _studyGroupService = new StudyGroupService();
    }

    public void run(){
        Prepodavatel prepodavatel1 = new Prepodavatel("Николай Степаныч", 1);
        _studyGroupService.characterCreate(prepodavatel1);
        Prepodavatel prepodavatel2 = new Prepodavatel("Виктор Семеныч", 2);
        _studyGroupService.characterCreate(prepodavatel2);
        Prepodavatel prepodavatel3 = new Prepodavatel("Геннадий Саныч", 3);
        _studyGroupService.characterCreate(prepodavatel3);

        Uchenyk uchenyk1 = new Uchenyk("Иван Иванов", 1);
        _studyGroupService.characterCreate(uchenyk1);
        Uchenyk uchenyk2 = new Uchenyk("Дима Димов", 2);
        _studyGroupService.characterCreate(uchenyk2);
        Uchenyk uchenyk3 = new Uchenyk("Вася Васьков", 3);
        _studyGroupService.characterCreate(uchenyk3);
        Uchenyk uchenyk4 = new Uchenyk("Петя Петров", 4);
        _studyGroupService.characterCreate(uchenyk4);
        Uchenyk uchenyk5 = new Uchenyk("Коля Сколков", 5);
        _studyGroupService.characterCreate(uchenyk5);
        Uchenyk uchenyk6 = new Uchenyk("Макс Максов", 6);
        _studyGroupService.characterCreate(uchenyk6);
        Uchenyk uchenyk7 = new Uchenyk("Олег Олегов", 7);
        _studyGroupService.characterCreate(uchenyk7);
        Uchenyk uchenyk8 = new Uchenyk("Настя Настева", 8);
        _studyGroupService.characterCreate(uchenyk8);
        Uchenyk uchenyk9 = new Uchenyk("Катя Катева", 9);
        _studyGroupService.characterCreate(uchenyk9);
        Uchenyk uchenyk10 = new Uchenyk("Аня Анева", 10);
        _studyGroupService.characterCreate(uchenyk10);

        List<Uchenyk> group1 = new ArrayList<>(Arrays.asList(
                uchenyk1, uchenyk2, uchenyk3
        ));
        List<Uchenyk> group2 = new ArrayList<>(Arrays.asList(
                uchenyk4, uchenyk5, uchenyk6
        ));
        List<Uchenyk> group3 = new ArrayList<>(Arrays.asList(
                uchenyk7, uchenyk8, uchenyk9, uchenyk10
        ));

        createGroup(prepodavatel1, group1);
        createGroup(prepodavatel2, group2);
        createGroup(prepodavatel3, group3);

        System.out.println("На данный момент работают 3 преподавателя и ведут небольшие группы.");
        getStudyGroupInfo(prepodavatel1, group1);
        System.out.println("------------------------------------------------------------");
        getStudyGroupInfo(prepodavatel2, group2);
        System.out.println("------------------------------------------------------------");
        getStudyGroupInfo(prepodavatel3, group3);
        System.out.println("------------------------------------------------------------");

        System.out.println("Добавим в 1 и 2 группы по одному ученику.");
        addUchenykToGroup(group1, new Uchenyk("Виктор Викторов", 11));
        addUchenykToGroup(group2, new Uchenyk("Сергей Сергеев", 12));
        getStudyGroupInfo(prepodavatel1, group1);
        System.out.println("------------------------------------------------------------");
        getStudyGroupInfo(prepodavatel2, group2);
        System.out.println("------------------------------------------------------------");

        System.out.println("Информация об одном из преподавателей: ");
        getInfoAboutCharacter(prepodavatel1);
        System.out.println("------------------------------------------------------------");

        System.out.println("Информация об одном из учеников: ");
        getInfoAboutCharacter(uchenyk4);
        System.out.println("------------------------------------------------------------");
    }

    private void createGroup(Prepodavatel prepodavatel, List<Uchenyk> uchenykList) {
        _studyGroupService.studyGroupCreate(prepodavatel, uchenykList);
    }
    private void addUchenykToGroup(List<Uchenyk> group, Uchenyk uchenyk) {
        _studyGroupService.addUchenykToGroup(group, uchenyk);
    }
    private void getStudyGroupInfo(Prepodavatel prepodavatel, List<Uchenyk> group) {
        _studyGroupService.studyGroupInfo(prepodavatel, group);
    }
    private void getInfoAboutCharacter(Character character) {
        if (character instanceof Prepodavatel) {
            _viewer.printPrepodavatel((Prepodavatel) character);
        } else if (character instanceof Uchenyk) {
            _viewer.printUchenyk((Uchenyk) character);
        }
    }
}
