package ex4;

public class MemberController {
	public int SIZE = 10;
	Member[] m = new Member[SIZE];

	public int existMemberNum() {
		int count = -1;
		
		
		while (++count < 10 && m[count]!=null);
		
		
		return count;
	}
	
	public Boolean checkId(String inputId) {
		int i = 0;
		while (m[i]!=null) {
			if(m[i].getId().equals(inputId)) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public void insertMember(String id,String name, int age,String email,String gender,String password) {
		int i = -1;
		while (m[++i]!=null);
		m[i] = new Member(id, name, password, email, gender, age);
	}
	
	public String searchId(String id) {
		int i = 0;
		while (m[i]!=null) {
			if(m[i].getId().equals(id)) {
				return m[i].inform();
			}
			i++;
		}
		return null;
	}
	public Member[] searchName(String name) {
		Member[] ret = new Member[SIZE];
		int i = 0;
		int j = 0;
	
		while (m[i]!=null) {
			if(m[i].getName().equals(name)) {
				ret[j++] = m[i];
			}
			i++;
		}
		return ret;
	}
	public Member[] searchEmail(String email) {
		Member[] ret = new Member[SIZE];
		int i = 0;
		int j = 0;
	
		while (m[i]!=null) {
			if(m[i].getEmail().equals(email)) {
				ret[j++] = m[i];
			}
			i++;
		}
		return ret;
	}
	public Boolean updatePassword(String id, String password) {
		int i = 0;
		while (m[i]!=null) {
			if(m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
			i++;
		}
		return false;
	}
	public Boolean updateName(String id,String name) {
		int i = 0;
		while (m[i]!=null) {
			if(m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
			i++;
		}
		return false;
	}
	public Boolean updateEmail(String id,String email) {
		int i = 0;
		while (m[i]!=null) {
			if(m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
			i++;
		}
		return false;
	}
	public Boolean delete(String id) {
		int i = 0;
		int num = existMemberNum();
		while (m[i]!=null) {
			if(m[i].getId().equals(id)) {
				m[i] = null;
				while (i < num - 1) {
					m[i] = m[i + 1];
					m[i + 1] = null;
					i++;
				}
				return true;
			}
			i++;
		}
		return false;
	}
	public void delete() {
		for (int i = 0; i < existMemberNum(); i++) {
			m[i] = null;
		}
	}
	public Member[] printAll() {
		return m;
	}

}
