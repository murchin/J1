package seminar4;

import seminar4.controller.StudentController;
import seminar4.controller.TeacherController;
import seminar4.model.Student;
import seminar4.model.StudentGroup;
import seminar4.model.Teacher;
import seminar4.repository.StudentRepository;
import seminar4.repository.TeacherRepozitory;
import seminar4.service.StudentService;
import seminar4.service.TeacherService;
import seminar4.view.SortType;
import seminar4.view.StudentView;
import seminar4.view.TeacherView;
import seminar4.view.UserView;

import javax.swing.text.View;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
//----------------------------------------------------------------------
        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        view.sendOnConsole(SortType.NONE);
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");
        view.sendOnConsole(SortType.NONE);
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.FAMILY);
        view.sendOnConsole(SortType.AGE);

        TeacherView viewTeacher = getTeacherView();
        viewTeacher.create("Irina Ivanova", 38, "0001");
        viewTeacher.create("Sergei Voron", 49, "0002");
        viewTeacher.create("Natalia Komarova", 35, "1111");
        viewTeacher.sendOnConsole(SortType.NONE);
        viewTeacher.create("Anton Kozlov", 29, "5556");
        viewTeacher.create("Leonid Lomov", 57, "6667");
        viewTeacher.sendOnConsole(SortType.NONE);
        viewTeacher.sendOnConsole(SortType.NAME);
        viewTeacher.sendOnConsole(SortType.FAMILY);
        viewTeacher.sendOnConsole(SortType.AGE);
    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }


    private static TeacherView getTeacherView() {
        TeacherRepozitory repository = new TeacherRepozitory();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }
}