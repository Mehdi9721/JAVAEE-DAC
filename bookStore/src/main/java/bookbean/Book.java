package bookbean;

import javax.persistence.Id;
import javax.persistence.*;
@Entity
public class Book {
    @Id
	int id;
String bookname,authName,quantity,price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthName() {
	return authName;
}
public void setAuthName(String authName) {
	this.authName = authName;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [id=" + id + ", bookname=" + bookname + ", authName=" + authName + ", quantity=" + quantity
			+ ", price=" + price + "]";
}

}
