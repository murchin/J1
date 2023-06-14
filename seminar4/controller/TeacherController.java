package seminar4.controller;

import seminar4.model.Student;
import seminar4.model.Teacher;
import seminar4.repository.UserRepository;
import seminar4.service.StudentService;
import seminar4.service.TeacherService;
import seminar4.service.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
private final UserService<Teacher> teacherService;
    //public UserService<Teacher> teacherService;
    public TeacherController(TeacherService teacherServiceService) {
        this.teacherService = teacherServiceService;
    }
    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherService.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return teacherService.getAllSortUsers();
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return teacherService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        teacherService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return teacherService.getAllSortUsersByAge();
    }
}
