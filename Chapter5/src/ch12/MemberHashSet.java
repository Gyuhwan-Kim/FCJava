package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
//		for(int i=0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempID = member.getMemberId();
//			if(tempID == memberID) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
//		System.out.println(memberID+"�� �������� �ʽ��ϴ�.");
//		return false;
		
		// Iterator
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberId();
			if(tempID == memberID) {
				hashSet.remove(member);
				return true;
			}
		}
		return false;
	}
	
	public void showAllMember() {
		for(Member member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}