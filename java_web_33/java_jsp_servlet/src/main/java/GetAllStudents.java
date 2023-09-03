import org.springframework.context.ApplicationContext;
import java.util.List;
public class GetAllStudents {
    public static void main(String[] args) {
        ApplicationContext ctx = ContextProvider.provideContext();
        StudentDao studentDao = ctx.getBean("stDao", StudentDao.class);
        List<Student> students = studentDao.getAllStudents();
        for (Student s : students)
        {
            System.out.println(s);
        }
    }
}
