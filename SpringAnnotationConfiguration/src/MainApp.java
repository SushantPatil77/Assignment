import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        AnnotationConfigApplicationContext annotationConfigApplicationContext = 
	                new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
	        Book book=(Book)annotationConfigApplicationContext.getBean("getBookBean");
	        System.out.println(book);
	        
	        Book book1 = (Book) annotationConfigApplicationContext.getBean("mybookbean");
	        Author author=(Author) annotationConfigApplicationContext.getBean("authorBean");
	        System.out.println(book1);
	        System.out.println(author);
	        annotationConfigApplicationContext.close();
	        
	        
	    }
	 
}
