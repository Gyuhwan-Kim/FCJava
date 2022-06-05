package ch13;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		//treeSet = new TreeSet<Member>();
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		// Iterator
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberId();
			if(tempID == memberID) {
				treeSet.remove(member);
				return true;
			}
		}
		return false;
	}
	
	public void showAllMember() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
