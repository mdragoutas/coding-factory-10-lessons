package gr.aueb.cf.java.ch15.interfaces;

public class SchoolServiceProvider {
    private TeacherServiceImpl teacherService;      // tightly coupling

    public SchoolServiceProvider() {
        teacherService = new TeacherServiceImpl();  // new
    }

    public void registerTeacher() {
        teacherService.register();
    }

    public void unregisterTeacher() {
        teacherService.unregister();
    }
}
