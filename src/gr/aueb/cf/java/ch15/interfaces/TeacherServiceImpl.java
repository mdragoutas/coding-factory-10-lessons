package gr.aueb.cf.java.ch15.interfaces;

public class TeacherServiceImpl implements ISchoolService{
    @Override
    public void register() {
        System.out.println("Teacher registered");
    }

    @Override
    public void unregister() {
        System.out.println("Teacher unregistered");
    }
}


