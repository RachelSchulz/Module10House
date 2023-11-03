/**
* Rachel Schulz - rsschulz
* CIS175 - Fall 2023
* Oct 15, 2023
*/
package house.beans;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

/**
 * @author Rachel Schulz - rsschulz
 * CIS175 - Fall 2023
 * Oct 15, 2023
 */
@Entity
@Data
public class House {
	@Id
	@GeneratedValue
	private long id;
	//@NotEmpty(message = "Field must contain data")
	//@Size(min = 1, message = "Field must contain at least 1 character")
	private String address;
	//@NotNull(message = "Field must contain data")
	//@Size(min = 1, message = "Field must contain at least 1 character")
	private String city;
	//@NotNull(message = "Field must contain data")
	private String state;
	//@NotNull(message = "Field must contain data")
	private int numBedroom;
	//@NotNull(message = "Field must contain data")
	private int numBath;
	
}
