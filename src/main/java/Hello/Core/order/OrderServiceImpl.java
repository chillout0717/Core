package Hello.Core.order;

import Hello.Core.dicount.DiscountPolicy;
import Hello.Core.dicount.FixDiscountPolicy;
import Hello.Core.member.Member;
import Hello.Core.member.MemberRepository;
import Hello.Core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.dicount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
