package librarymanagementsystem;

public class Book {

	    protected String title;
	    protected String author;
	    protected String category;
	    protected boolean availability;
		
	    public Book(String title, String author, String category, boolean availability) {
			super();
			this.title = title;
			this.author = author;
			this.category = category;
			this.availability = availability;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public boolean isAvailability() {
			return availability;
		}

		public void setAvailability(boolean availability) {
			this.availability = availability;
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", category=" + category + ", availability="
					+ availability + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor() + ", getCategory()="
					+ getCategory() + ", isAvailability()=" + isAvailability() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

	    
		
	    
	    
}
