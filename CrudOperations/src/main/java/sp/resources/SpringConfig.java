package sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {
	@Bean
	public DriverManagerDataSource myDatabase() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/arun");
		datasource.setUsername("root");
		datasource.setPassword("vamsi@9573");
		
		return datasource;
		
	}

	@Bean
	public JdbcTemplate connection() {
		
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(myDatabase());
		return temp;
		
	}
	
}
