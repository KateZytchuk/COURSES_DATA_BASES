package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import DAL.Person_DAO;
import DAL.Person_DAO_Mock;

public class Person_DM extends AbstractTableModel
{

	List<Person> lst = null;
	Person_DAO pd = null;
	public Person_DM()
	{
		pd = new Person_DAO_Mock(); //��� ������ � ������ ����� ������� ���
		lst = pd.read();	
	}
	@Override
	public String getColumnName(int col)
	{
		String [] str = {"ID", "LName", "FName", "Age"};
		return str[col];
	}
	@Override
	public int getRowCount() 
	{
		return lst.size();
	}

	@Override
	public int getColumnCount() 
	{
		Person p = new Person();
		Class cc = p.getClass();
		Field [] ff  = cc.getDeclaredFields();
		int count = 0;
		for(Field f: ff)
		{
			count++;
		}
		return ff.length;
	}

	@Override
	public Object getValueAt(int row, int column) 
	{
		Person oo = lst.get(row);
		Object ret = null;
		switch(column)
		{
		case 0: 
			ret = oo.getId();
			break;
		case 1:
			ret = oo.getLname();
			break;
		case 2:
			ret = oo.getFname();
			break;
		case 3:
			ret = oo.getAge();
			break;
		}
		return ret;
	}
	ActionCreate create = new ActionCreate();
	public class ActionCreate implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int my_id = Integer.parseInt(PPanel.text_id.getText());
			String my_fname = PPanel.text_fname.getText();
			String my_lname = PPanel.text_lname.getText();
			int my_age = Integer.parseInt(PPanel.text_age.getText());
			Person my = new Person(my_id, my_lname, my_fname,  my_age);
			pd.create(my);	
			my_reload();
			JOptionPane.showMessageDialog(null, "��������� ������ �   ��");
		}
	}
	ActionRead read = new ActionRead();
	public class ActionRead implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			pd.read();
			my_reload();
			JOptionPane.showMessageDialog(null, "������ ������ ��  ��");
		}
	}
	ActionUpdate update = new ActionUpdate();
	public class ActionUpdate implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int my_id = Integer.parseInt(PPanel.text_id.getText());
			String my_fname = PPanel.text_fname.getText();
			String my_lname = PPanel.text_lname.getText();
			int my_age = Integer.parseInt(PPanel.text_age.getText());
			Person my = new Person(my_id, my_lname, my_fname,  my_age);
			pd.update(my);	
			my_reload();
			JOptionPane.showMessageDialog(null, "��������� ������ ��  ��");
		}
	}
	ActionDelete delete = new ActionDelete();
	public class ActionDelete implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int my_id = Integer.parseInt(PPanel.text_id.getText());
			String my_fname = PPanel.text_fname.getText();
			String my_lname = PPanel.text_lname.getText();
			int my_age = Integer.parseInt(PPanel.text_age.getText());
			Person my = new Person(my_id,  my_lname, my_fname, my_age);
			pd.delete(my);	
			my_reload();
			JOptionPane.showMessageDialog(null, "������� ������ ��  ��");
			
		}	
	}
	private void my_reload()
	{
		pd.read();
		fireTableDataChanged();
	}
}
