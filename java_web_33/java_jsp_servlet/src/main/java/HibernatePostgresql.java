import java.io.File;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernatePostgresql {
    public static void main(String[] args) {
        String confFile = "src/main/resources/hibernate.cfg.xml";
        ClassLoader classLoader = HibernatePostgresql.class.getClassLoader();
        File f = new File(classLoader.getResource(confFile).getFile());
        SessionFactory sessionFactory = new Configuration().configure(f).buildSessionFactory();
        Session session = sessionFactory.openSession();
        // CREATE
        saveStudentRecord(session);
        // READ
        fetchStudentRecord(session);
        // UPDATE
        updateStudentRecord(session);
        // DELETE
        deleteStudentRecord(session);
        session.close();
    }
    private static void saveStudentRecord(Session session) {
        StudentPostgresql student1 = new StudentPostgresql();
        student1.setFirstName("Jason");
        student1.setLastName("Roy");
        student1.setRoll(1);
        student1.setStandard("A");
        session.beginTransaction();
        session.save(student1);
        session.getTransaction().commit();
        System.out.println("Record saved successfully...");
    }
    private static void fetchStudentRecord(Session session) {
        Query query = session.createQuery("FROM Student");
        List<StudentPostgresql> Students = query.list();
        System.out.println("Reading student records...");
        for (StudentPostgresql studentObj : Students) {
            System.out.println("First Name: " + studentObj.getFirstName());
            System.out.println("Last Name: " + studentObj.getLastName());
            System.out.println("Roll Number: " + studentObj.getRoll());
            System.out.println("Standard: " + studentObj.getStandard());
        }
    }
    private static void updateStudentRecord(Session session) {
        int id = 3;
        StudentPostgresql student1 = (StudentPostgresql) session.get(StudentPostgresql.class, id);
        student1.setRoll(5);
        student1.setStandard("B");
        session.beginTransaction();
        session.saveOrUpdate(student1);
        session.getTransaction().commit();
        System.out.println("Record updated successfully...");
    }
    private static void deleteStudentRecord(Session session) {
        System.out.println("Record saved successfully...");
    }
}
