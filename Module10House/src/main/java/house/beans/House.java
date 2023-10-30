/**
* Rachel Schulz - rsgoodrich
* CIS175 - Fall 2023
* Oct 15, 2023
*/
package house.beans;


import jakarta.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

/**
 * @author Rachel Schulz - rsgoodrich
 * CIS175 - Fall 2023
 * Oct 15, 2023
 */
@Entity
@Data
public class House {
	@Id
	@GeneratedValue
	private long id;
	private String address;
	private String city;
	private String state;
	private int numBedroom;
	private int numBath;
	
}
