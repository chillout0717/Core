package Hello.Core;

import Hello.Core.dicount.DiscountPolicy;
import Hello.Core.dicount.RateDiscountPolicy;
import Hello.Core.member.MemberService;
import Hello.Core.member.MemberServiceImpl;
import Hello.Core.member.MemoryMemberRepository;
import Hello.Core.order.OrderService;
import Hello.Core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
