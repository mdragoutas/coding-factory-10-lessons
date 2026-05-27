package gr.aueb.cf.java.ch15.interfaces;

public class Main {

    public static void main(String[] args) {
        ISchoolService studentService = new StudentServiceImpl();
        ISchoolService teacherService = new TeacherServiceImpl();

        studentService.register();
        studentService.unregister();

        teacherService.register();
        teacherService.unregister();

        doRegister(studentService);
        doRegister(teacherService);

        doUnregister(studentService);
        doUnregister(teacherService);
    }

    // Agnostic method that can work with any ISchoolService implementation
    public static void doRegister(ISchoolService service) {
        service.register();
    }

    public static void doUnregister(ISchoolService service) {
        service.unregister();
    }
}
