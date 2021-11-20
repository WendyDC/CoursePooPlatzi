package model;

import java.util.ArrayList;
import java.util.Date;

import util.AmazonUtil;

public class Book extends Publication implements IVisualizable {
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	private ArrayList<Page> pages;
	
	
	public ArrayList<Page> getPages() {
		return pages;
	}



	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}



	public Book(String title, Date edititionDate, String editorial, String[] authors, ArrayList<Page> page) {
		super(title, edititionDate, editorial);
		// TODO Auto-generated constructor stub
		setAuthors(authors);
		this.pages = pages;
	}


	
	/** 
	 * @return int
	 */
	public int getId() {
		return id;
	}


	
	/** 
	 * @return String
	 */
	public String getIsbn() {
		return isbn;
	}


	
	/** 
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	
	/** 
	 * @return String
	 */
	public String isReaded() {
		String leido = "";
		if(readed == true) {
			leido = "Sí";
		}else {
			leido = "No";
		}
		
		return leido;
	}


	
	/** 
	 * @param readed
	 */
	public void setReaded(boolean readed) {
		this.readed = readed;
	}
	
	
	/** 
	 * @return boolean
	 */
	public boolean getIsReaded() {
		return readed;
	}


	
	/** 
	 * @return int
	 */
	public int getTimeReaded() {
		return timeReaded;
	}


	
	/** 
	 * @param timeReaded
	 */
	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailBook = "\n :: BOOK ::" + 
							"\n Title: " + getTitle() +
							"\n Editorial: " + getEditorial() + 
							"\n Edition Date: " + getEdititionDate() +
							"\n Authors: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i] + " ";
		}
		return  detailBook;
	}


	
	/** 
	 * @param dateI
	 * @return Date
	 */
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}


	
	/** 
	 * @param dateI
	 * @param dateF
	 */
	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getTime() > dateI.getTime()) {
			setTimeReaded((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeReaded(0);
		}
	}
	
	
	
	/** 
	 * @return ArrayList<Book>
	 */
	public static ArrayList<Book> makeBookList() {
		ArrayList<Book> books = new ArrayList();
		String[] authors = new String[3];
		for (int i = 0; i < 3; i++) {
			authors[i] = "author "+i;
		}

		ArrayList<Page> pages = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			pages.add(new Book.Page(i, "Content page: "+i));
		}

		for (int i = 1; i <= 5; i++) {
			books.add(new Book("Book " + i, new Date(), "editorial " + i, authors, pages));
		}
		
		return books;
	}

	public void view(){
		setReaded(true);
		Date dateI = startToSee(new Date());
		
	    int i= 0;
		do{
			System.out.println(".............");
			System.out.println("Page: "+getPages().get(i).getNumber());
			System.out.println(getPages().get(i).getContent());
			System.out.println(".............");
		
			if(i!=0){
				System.out.println("1. Página anterior.");
			}

			System.out.println("2. Página siguiente.");
			System.out.println("0. Cerrar libro.");

			int response = AmazonUtil.validateUserResponseMenu(0, 2);

			if(response == 1){
				i--;
			}else if(response == 2){
				i++;
			}else if(response == 0){
				break;
			}
		}while(i < getPages().size());
		
		//Termine de verla
		stopToSee(dateI, new Date());
		System.out.println();
		System.out.println("Leíste: " + toString());
		System.out.println("Por: " + getTimeReaded() + " milisegundos");
	}

	public static class Page{

		private int id;
		private int number;
		private String content;

		public Page(int number, String content) {
			this.number = number;
			this.content = content;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}

		

	}
	
}
