package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*-1;
	}
}

public class MemberTreeSetTest {

	public static void main(String[] args) {
//		TreeSet<String> set = new TreeSet<>();
//		set.add("홍길동");
//		set.add("강감찬");
//		set.add("이순신");
//		
//		System.out.println(set);
		
//		MemberTreeSet memberTreeSet = new MemberTreeSet();
//		
//		Member memberHong = new Member(1004, "홍길동");
//		Member memberLee = new Member(1001, "이순신");
//		Member memberKim = new Member(1002, "김유신");
//		Member memberKang = new Member(1003, "강감찬");
//		
//		memberTreeSet.addMember(memberLee);
//		memberTreeSet.addMember(memberKim);
//		memberTreeSet.addMember(memberKang);
//		memberTreeSet.addMember(memberHong);
//		
//		memberTreeSet.showAllMember();
		
		TreeSet<String> set = new TreeSet<>(new MyCompare());
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
	}
}
