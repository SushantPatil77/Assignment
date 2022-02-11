import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("Springtest.xml");
        Object book_bean = classPathXmlApplicationContext.getBean("book");
        Object book_bean1 = classPathXmlApplicationContext.getBean("book");
        Object book_bean2 = classPathXmlApplicationContext.getBean("book");
        Object book_bean3 = classPathXmlApplicationContext.getBean("book");
        Object book_bean4 = classPathXmlApplicationContext.getBean("book1");
        Object Autor = classPathXmlApplicationContext.getBean("Autor");
        System.out.println(book_bean);
        System.out.println(book_bean1);
        System.out.println(book_bean2);
        System.out.println(book_bean3);
        System.out.println(book_bean4);
        System.out.println(Autor);
    }
}
