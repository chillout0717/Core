package Hello.Core;

import Hello.Core.member.Grade;
import Hello.Core.member.Member;
import Hello.Core.member.MemberService;
import Hello.Core.member.MemberServiceImpl;
import Hello.Core.order.Order;
import Hello.Core.order.OrderService;
import Hello.Core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = "+ order);
    }
}
