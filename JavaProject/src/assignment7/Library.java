package assignment7;

public class Library {
	
	Book[] book;//has a relationship
	static int size=0;
	final static int maxBookSize=6;
	
	public Library() {
		size=0;
		this.book = new Book[maxBookSize];
	}
	public void adddBook(Book book) {
		if(size<maxBookSize) {
			book[size++]=book;
			System.out.println("Book added successfully..");
		}else {
			System.out.println("Library is Full!!!");
		}
	}
	public void removeBook(Book book) {
		for(int i=0;i<size;i++) {
			if(book[i].author.equals(book.author)) {
				for(int j=i;j<size-1;j++) {
					book[j]-book[j+1];
				}
				book[size-1]=null;
				size--;
				System.out.println("Book revomed");
				break;
			}
			else {
				System.out.println("Book is npt available");
			}
		}
	}
	public void display()
	{
		
		if(size==0) {
			System.out.println("B");
		}else {
			System.out.println();
			for(Book books:book) {
				
			}
		}
//		System.out.println("No of Book : "+size);
//		System.out.println("Total no of Books : "+bookSize);
//		System.out.println("Book Title is: "+book.title+" And Book Author is: "+book.author);
//		System.out.println("===========================================================");
	}

}
