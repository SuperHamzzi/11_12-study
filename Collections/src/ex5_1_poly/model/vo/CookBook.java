package ex5_1_poly.model.vo;

public class CookBook extends Book{
	private boolean coupon;

	public CookBook() {
	}

	public CookBook(String title, String author, String publisher,boolean coupon) {
		super(title, author, publisher);
		this.coupon=coupon;
	}

	@Override
	public String toString() {
		return "CookBook [coupon=" + coupon + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getPublisher()=" + getPublisher() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

}
