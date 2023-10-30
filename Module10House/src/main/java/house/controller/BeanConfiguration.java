/**
* Rachel Schulz - rsgoodrich
* CIS175 - Fall 2023
* Oct 15, 2023
*/
package house.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import house.beans.House;

/**
 * @author Rachel Schulz - rsgoodrich
 * CIS175 - Fall 2023
 * Oct 15, 2023
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public House house() {
		House bean = new House();
		return bean;
	}
	
}
