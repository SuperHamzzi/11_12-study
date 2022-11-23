package com.multi.ex04.Map;

public class MapBasic {
	// Map이란?
		// Key - Value로 데이터가 구성되어 있는 컬랙션
		// Key는 주로 숫자나 문자 활용, Value는 객체를 활용
		// Key 기준으로만 중복확인함 -> Comparable, equals 필요 없음! 
		
		// HashMap 		 : 순서 보장 안되고, 제일 빠른 성능, 가장 많이 사용하는 Map. ★★★★★
		// LinkedHashMap : Key의 삽입순서 보장. ★★
		// TreeMap 		 : Key의 문자열로 정렬. ★★
		// HashTable 	 : HashMap Thread Safe Version ★ 
		//					현업에서 자주사용  -> ConcurrentHashMap ★★★
		public static void main(String[] args) {
		}
}
