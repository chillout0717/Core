package Hello.Core.dicount;

import Hello.Core.member.Grade;
import Hello.Core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPrecent = 10;


    @Override
    public int discount(Member member, int price) {
         if (member.getGrade() == Grade.VIP){
             return price * discountPrecent / 100;
         } else {
             return 0;
         }
    }
}
