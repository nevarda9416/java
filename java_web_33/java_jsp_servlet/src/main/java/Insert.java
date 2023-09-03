import org.springframework.context.ApplicationContext;
public class Insert {
    public static void main(String[] args) {
        ApplicationContext ctx = ContextProvider.provideContext();
        StudentDao studentDao = ctx.getBean("stDao", StudentDao.class);
        // insert
        Student s = new Student(2, "Nisha");
        System.out.println(s);
        studentDao.insert(s);
    }
}
