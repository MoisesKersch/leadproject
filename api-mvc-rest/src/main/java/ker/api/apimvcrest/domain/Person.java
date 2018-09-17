package ker.api.apimvcrest.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Person 
{
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String lastName;
	private Date birth;
}
