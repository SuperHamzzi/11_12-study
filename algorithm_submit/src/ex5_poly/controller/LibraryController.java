package ex5_poly.controller;

import ex5_1_poly.model.vo.AniBook;
import ex5_1_poly.model.vo.Book;
import ex5_1_poly.model.vo.CookBook;
import ex5_poly.model.vo.Member;

public class LibraryController {
		public static void main(String[] args) {
	Member mem = null;
	Book[] bList = new Book[5];
	
	bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
	bList[1] = new AniBook("탑의신", "소고기", "내이놈", 17);
	bList[2] = new AniBook("루피의 원피스","루피","japan", 12);
	bList[3] = new CookBook("이혜정의 얼마나 맛있게요","이혜정","문학", false);
	bList[4] = new CookBook("최현석 날 따라해봐","최현석","소금책", true);
		
		}	
	public void insertMember(Member mem) { 
		this.mem=mem;
	}
	public Member myInfo() {
		return mem;
	}
	public Book[] selectAll() {
		return bList;
	}
	public Book[] searchBook(String keyword) {
		
	}
	public int rentBook(int index) {
		
	}
}