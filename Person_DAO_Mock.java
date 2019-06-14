package DAL;

import java.util.ArrayList;
import java.util.List;
import view.Person;

public class Person_DAO_Mock implements  Person_DAO
{
	ArrayList <Person> lst = new ArrayList<Person>();
	ArrayList<Person> p_1 = new ArrayList<Person>();
	public static ArrayList<Person> init ()
	{	
		ArrayList <Person> pp = new ArrayList<Person>();
		pp.add(new Person(17, "Бобров" , "Борис", 49));
		pp.add(new Person(30, "Дунаев" , "Дмитрий", 44));
		pp.add(new Person(4, "Жуков" , "Евгений", 36));
		pp.add(new Person(42, "Вениаминов" , "Владимир", 27));
		pp.add(new Person(16, "Каверин" , "константи", 21));
		pp.add(new Person(29, "Армавиров" , "Александр", 26));
		pp.add(new Person(31, "Леонов" , "Антон", 19));
		pp.add(new Person(15, "Ерохин" , "Михаил", 16));
		pp.add(new Person(5, "Дружинин" , "Дмитрий", 50));
		pp.add(new Person(28, "Лисовой" , "Вячеслав", 41));
		pp.add(new Person(18, "Валевский" , "Антон", 50));
		pp.add(new Person(14, "Мухин" , "Евгений", 45));
		pp.add(new Person(6, "Инютин" , "Александр", 33));
		pp.add(new Person(32, "Аксютин" , "Леонид", 27));
		pp.add(new Person(27, "Левочкин" , "Святослав", 65));
		pp.add(new Person(13, "Дуров" , "Павел", 75));
		pp.add(new Person(19, "Гронский" , "Сергей", 45));
		pp.add(new Person(33, "Катаев" , "Зиновий", 29));
		pp.add(new Person(41, "Жакун" , "Василий", 24));
		pp.add(new Person(43, "Машков" , "Олег", 28));
		pp.add(new Person(12, "Деточкин" , "Олег", 38));
		pp.add(new Person(26, "Панин" , "Владлен", 35));
		pp.add(new Person(20, "Антонов" , "Антон", 16));
		pp.add(new Person(34, "Исаев" , "Игорь", 19));
		pp.add(new Person(39, "Греков" , "Александр", 17));
		pp.add(new Person(11, "Лаврентьев" , "Алексей", 25));
		pp.add(new Person(21, "корский" , "антон", 30));
		pp.add(new Person(25, "Носов" , "Михаил", 49));
		pp.add(new Person(10, "Борисов" , "Борис", 55));
		pp.add(new Person(35, "Евстигнеев" , "Андрей", 80));
		pp.add(new Person(22, "Дрогов" , "Сергей", 17));
		pp.add(new Person(38, "Кузькин" , "Кузьма", 38));
		pp.add(new Person(7, "Воеводин" , "Станислав", 25));
		pp.add(new Person(36, "Леонов" , "Евгений", 16));
		pp.add(new Person(23, "Завгородний" , "Инокентий", 18));
		pp.add(new Person(9, "Григорьев" , "Евгений", 55));
		pp.add(new Person(40, "Букин" , "Павел", 65));
		pp.add(new Person(24, "Зуев" , "Александр", 30));
		pp.add(new Person(8, "Данилов" , "Сергей",  27));
		pp.add(new Person(37, "Васечкин" , "Василий", 37));
		return pp;
	}
	public Person_DAO_Mock()
	{
		lst = init();
	}
	@Override
	public void create(Person p) 
	{
		lst.add(p);		
	}

	@Override
	public List<Person> read() 
	{
		return lst;
	}

	@Override
	public void update(Person p) 
	{
		int nov_id = p.getId();
		int indx_chng = 0;
		for (Person n: lst)
		{
			if(n.getId() == nov_id)
			{
				indx_chng = lst.indexOf(n);
			}
			else
			{
				p_1.add(n);
			}
		}
		lst.set(indx_chng, p);
	}

	@Override
	public void delete(Person p) 
	{
		int nov_id = p.getId();
		int indx= 0;
		for(Person n : lst)
		{
			if(n.getId() == nov_id )
			{
				indx = lst.indexOf(n);
			}
		}
		lst.remove(indx);
	}
}
