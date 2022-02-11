import java.util.Objects;

public class Book {
	 private Integer isbn;
	    private String title;
	    private String price;
	    
		public Book(Integer isbn, String title) {
			super();
			this.isbn = isbn;
			this.title = title;
		}
		public Book(Integer isbn, String title, String price) {
			super();
			this.isbn = isbn;
			this.title = title;
			this.price = price;
		}
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public int hashCode() {
			return Objects.hash(isbn, price, title);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Objects.equals(isbn, other.isbn) && Objects.equals(price, other.price)
					&& Objects.equals(title, other.title);
		}
		public Integer getIsbn() {
			return isbn;
		}
		public void setIsbn(Integer isbn) {
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
		}
}
