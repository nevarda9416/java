import org.springframework.context.ApplicationContext;

public class GetStudent {
    public static void main(String[] args) {

        ApplicationContext ctx= ContextProvider.provideContext();
        StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);

        // update
        Student s=studentDao.getStudent(1);
        System.out.println(s);

    }
}