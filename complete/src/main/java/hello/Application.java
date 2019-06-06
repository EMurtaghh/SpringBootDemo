
package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import util.HibernateUtil;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //run spring application
        SpringApplication.run(Application.class, args);

        //Make questions
        List<String> wrongAnswers = new ArrayList<>();
        wrongAnswers.add("ZXC");
        wrongAnswers.add("XCV");
        wrongAnswers.add("CVB");

        Question q1 = new Question("App Q1","What is your name?", 1, "ASD", wrongAnswers);
        Question q2 = new Question("App Q2","What is your quest?", 3, "ASD", wrongAnswers);
        Question q3 = new Question("App Q3","What is the airspeed velocity of an unladen swallow?", 10, "ASD", wrongAnswers);

        //Save questions with hibernate
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            //start a transaction
//            transaction = session.beginTransaction();
//            //save the questions
//            session.save(q1);
//            session.save(q2);
//            session.save(q3);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//
//        //access stuff from hibernate DB
//        try(Session session = HibernateUtil.getSessionFactory().openSession()){
//            List<Question> allQuestions = session.createQuery("from Quesion", Question.class).list();
//            allQuestions.forEach(q -> System.out.println(q.getQuestionText()));
//        } catch (Exception e) {
//            if(transaction != null){
//                transaction.rollback();
//            }
//        }


    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
