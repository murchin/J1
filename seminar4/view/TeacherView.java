package seminar4.view;

import seminar4.controller.UserController;
import seminar4.model.Student;
import seminar4.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{

    UserController<Teacher> controller;
    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }
    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
    };
        if (teachers == null)  {
            System.out.println("teachers is null");
            return;
        }
        System.out.println("=====================");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("=====================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {controller.removeUser(fullName);}
}
