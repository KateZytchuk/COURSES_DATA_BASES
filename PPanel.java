package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PPanel extends JFrame
{
	JFrame my_pnl = new JFrame();
	static JTextField text_id, text_fname, text_lname, text_age;
	JScrollPane scr;
	 static JTable tbl;
	Person_DM dm = new Person_DM();
	public PPanel()
	{	
		my_pnl.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// что будет при выходе
		add_table();		
		add_lable();
		add_textfield();
		add_buttons();
		my_pnl.setSize(830,650);//задаем размеры окна при старте 
		my_pnl.setVisible(true);//делаем видимым
	}
	public  void add_table()
	{		
		tbl = new JTable(dm);
		scr = new JScrollPane(tbl);
		scr.setSize(400, 550);
		scr.setLocation(10, 10);
		my_pnl.add(scr);
	}
	public void add_lable()
	{
		//_____________________________
		// добавляем надпись "ID"
		//_____________________________
		JLabel title_id = new JLabel("ID", JLabel.CENTER);
		title_id.setForeground(Color.black);
		title_id.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 16));
		title_id.setLocation(645, 10);
		title_id.setSize(70, 65);
		my_pnl.add(title_id);

		//_____________________________
		// добавляем надпись "FName"
		//_____________________________
		JLabel title_fname = new JLabel("FName", JLabel.CENTER);
		title_fname.setForeground(Color.black);
		title_fname.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 16));
		title_fname.setLocation(660, 150);
		title_fname.setSize(70, 65);
		my_pnl.add(title_fname);

		//_____________________________
		// добавляем надпись "LName"
		//_____________________________
		JLabel title_lname = new JLabel("LName", JLabel.CENTER);
		title_lname.setForeground(Color.black);
		title_lname.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 16));
		title_lname.setLocation(660, 80);
		title_lname.setSize(70, 65);
		my_pnl.add(title_lname);

		//_____________________________
		// добавляем надпись "Age"
		//_____________________________
		JLabel title_age = new JLabel("Age", JLabel.CENTER);
		title_age.setForeground(Color.black);
		title_age.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 16));
		title_age.setLocation(648, 220);
		title_age.setSize(70, 65);
		my_pnl.add(title_age);
	}
	public void add_textfield()
	{
		//_____________________________
		// добавляем текстовое поле для "ID"
		//_____________________________
		text_id = new JTextField(20);
		text_id.setLocation(420, 30);
		text_id.setSize(250, 25);
		text_id.setHorizontalAlignment(JTextField.RIGHT);
		my_pnl.add(text_id);

		//_____________________________
		// добавляем текстовое поле для "FName"
		//_____________________________
		text_fname = new JTextField(20);
		text_fname.setLocation(420, 170);
		text_fname.setSize(250, 25);
		text_fname.setHorizontalAlignment(JTextField.RIGHT);
		my_pnl.add(text_fname);

		//_____________________________
		// добавляем текстовое поле для "LName"
		//_____________________________
		text_lname = new JTextField(20);
		text_lname.setLocation(420, 100);
		text_lname.setSize(250, 25);
		text_lname.setHorizontalAlignment(JTextField.RIGHT);
		my_pnl.add(text_lname);

		//_____________________________
		// добавляем текстовое поле для "Age"
		//_____________________________	
		text_age = new JTextField(20);
		text_age.setLocation(420, 240);
		text_age.setSize(250, 25);
		text_age.setHorizontalAlignment(JTextField.RIGHT);
		my_pnl.add(text_age);
	}
	public void add_buttons()
	{
		//_____________________________
		// добавляем кнопку "Создать"
		//_____________________________
		JButton crt = new JButton ("Create");
		crt.setSize(80, 30);
		crt.setLocation(420, 530);
		my_pnl.add(crt);
		crt.addActionListener(dm.create);		
		//_____________________________
		// добавляем кнопку "Считать"
		//_____________________________
		JButton rd = new JButton ("Read");
		rd.setSize(80, 30);
		rd.setLocation(520, 530);
		my_pnl.add(rd);
		rd.addActionListener(dm.read);
		//_____________________________
		// добавляем кнопку "Обновить"
		//_____________________________
		JButton upd = new JButton ("Update");
		upd.setSize(80, 30);
		upd.setLocation(620, 530);
		my_pnl.add(upd);
		upd.addActionListener(dm.update);
		//_____________________________
		// добавляем кнопку "Удалить"
		//_____________________________
		JButton dlt = new JButton ("Delete");
		dlt.setSize(80, 30);
		dlt.setLocation(720, 530);
		my_pnl.add(dlt);
		dlt.addActionListener(dm.delete);
	}
}
