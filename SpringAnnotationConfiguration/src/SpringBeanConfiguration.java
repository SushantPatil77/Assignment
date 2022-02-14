import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class SpringBeanConfiguration {
	   @Bean
	    public Book getBookBean() 
	   {
	        return new Book();
      }
	   
	   @Bean(name = "authorBean")
	    @Scope("prototype")
	    public Author getAuthorBean()
	    {  // default bean name
	        return new Author();
	    }
}