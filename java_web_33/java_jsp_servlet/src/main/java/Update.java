import org.springframework.context.ApplicationContext;
public class Update {
    public static void main(String[] args) {
        ApplicationContext ctx = ContextProvider.provideContext();
        StudentDao studentDao = ctx.getBean("stDao", StudentDao.class);
        // insert
        Student s = studentDao.getStudent(1);
        s.setName("Priya");
        System.out.println(s);
        studentDao.update(s);
    }
}
