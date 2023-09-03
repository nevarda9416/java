import org.springframework.context.ApplicationContext;
import java.util.List;
public class Delete {
    public static void main(String[] args) {
        ApplicationContext ctx = ContextProvider.provideContext();
        StudentDao studentDao = ctx.getBean("stDao", StudentDao.class);
        studentDao.delete(2);
    }
}
