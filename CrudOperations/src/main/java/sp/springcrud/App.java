package sp.springcrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import sp.resources.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {


    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	JdbcTemplate template =context.getBean(JdbcTemplate.class);
    	
        
      String query = "INSERT INTO student VALUES (?, ?, ?)";
      
      query.charAt(9);
      
      
      count = template.update(query, 2, "chanran reddy", "Andhra");
//      String query = "UPDATE student SET studentName = ?, studentAddress = ? WHERE studentId = ?";
//      int count =template.update(query, "Siva", "Ap", 2);
      
 //     String query = "DELETE FROM student WHERE studentId = ?";
 //     int count =template.update(query, 2);
    	
    if(count>0) {
    	System.err.println("sucessful");
    }else {
    	System.out.println("failed");
    }
    	
    	
    }
    
    
    String str= new String("vamsi");
    
    str.
    
    
    
    
    
    
}
