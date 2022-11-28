package ex5_1_poly.model.vo;

public class AniBook extends Book{
	private int accessAge;
	AniBook(){
		
	}
	
	

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge=accessAge;
	}



	@Override
	public String toString() {
		return "AniBook [accessAge=" + accessAge + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getPublisher()=" + getPublisher() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
