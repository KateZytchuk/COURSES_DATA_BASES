package DAL;

import java.sql.*;
import java.util.List;

import view.Person;

public class Person_DAO_Sql implements Person_DAO
{
	Person_DAO_Sql model = new Person_DAO_Sql();
	public void connection_to_database()
	{
		
	}
	public Person_DAO_Sql()
	{
		
	}
	@Override
	public void create(Person p) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> read() 
	{
		
		return null;
	}

	@Override
	public void update(Person p) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Person p) 
	{
		// TODO Auto-generated method stub
		
	}
	
}
