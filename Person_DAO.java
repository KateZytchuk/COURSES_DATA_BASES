package DAL;
import java.util.List;

import view.Person;

public interface Person_DAO 
{
	public void create (Person p);
	public List <Person> read ();
	public void update(Person p);
	public void delete (Person p);
}
