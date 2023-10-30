/**
* Rachel Schulz - rsgoodrich
* CIS175 - Fall 2023
* Oct 15, 2023
*/
package house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import house.beans.House;

/**
 * @author Rachel Schulz - rsgoodrich
 * CIS175 - Fall 2023
 * Oct 15, 2023
 */
@Repository
public interface IHouseRepository extends JpaRepository<House, Long> {

}
