package Hello.Core;

import Hello.Core.member.Grade;
import Hello.Core.member.Member;
import Hello.Core.member.MemberService;
import Hello.Core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "member", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = "+ findMember.getName());
        System.out.println("member = "+ member.getName());
    }
}
