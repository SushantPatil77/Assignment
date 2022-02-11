import java.util.Objects;

public class Autor {
  private Integer autorId;
  private String autorName;
  private String Countary;
  private Book bookRefactor;
public Autor() {
	super();
	// TODO Auto-generated constructor stub
}
public Autor(Integer autorId, String autorName, String countary, Book bookRefactor) {
	super();
	this.autorId = autorId;
	this.autorName = autorName;
	this.Countary = countary;
	this.bookRefactor = bookRefactor;
}
@Override
public int hashCode() {
	return Objects.hash(Countary, autorId, autorName, bookRefactor);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Autor other = (Autor) obj;
	return Objects.equals(Countary, other.Countary) && Objects.equals(autorId, other.autorId)
			&& Objects.equals(autorName, other.autorName) && Objects.equals(bookRefactor, other.bookRefactor);
}
public Integer getAutorId() {
	return autorId;
}
public void setAutorId(Integer autorId) {
	this.autorId = autorId;
}
public String getAutorName() {
	return autorName;
}
public void setAutorName(String autorName) {
	this.autorName = autorName;
}
public String getCountary() {
	return Countary;
}
public void setCountary(String countary) {
	this.Countary = countary;
}
public Book getBookRefactor() {
	return bookRefactor;
}
public void setBookRefactor(Book bookRefactor) {
	this.bookRefactor = bookRefactor;
}
@Override
public String toString() {
	return "Autor [autorId=" + autorId + ", autorName=" + autorName + ", Countary=" + Countary + ", bookRefactor="
			+ bookRefactor + "]";
}
  
  
  
  
}
