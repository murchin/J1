package seminar4.model;

public class Teacher extends User implements  Comparable<Teacher> {
    public Teacher(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
    }

    @Override
    public int compareTo(Teacher o) {
        return getAge().compareTo(o.getAge());
    }

    public String toString() {
        return String.format("Teacher: %s\t%s\t%s\t%s", getId(), getFullName(), getAge(), getPhoneNumber());
    }
}
