package com.encore.service;
import com.encore.service.NoteBook;
import com.encore.util.MyDate;

public class Programmer {
	public String name;
	public MyDate birthday;
	public String company;
	public String tech;
	
	public NoteBook noteBook;
	
	public Programmer(String name, MyDate birthday, String company, String tech) {
		this.name = name;
		this.birthday = birthday;
		this.company = company;
		this.tech = tech;
	}
	
	public void buyNoteBook(NoteBook notebook) {
		this.noteBook = notebook;
	}
	
	public NoteBook getNoteBook() {
		return noteBook;
	}
	
	public String getProgrammerInfo() {
		return name + "\t" + birthday.getDate() + "\t" + company + "\t" + tech;  
	}

}
