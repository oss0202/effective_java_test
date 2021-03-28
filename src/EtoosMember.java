import java.util.Date;

public class EtoosMember {
    private String id;
    private int age;
    private String phoneNumber;
    private Date birthDate;
    private String hobby;
    private int grade;
    private String couponId;

    private final static String grade_01_coupon = "1학년쿠폰_id";
    private final static String grade_02_coupon = "2학년쿠폰_id";
    private final static String grade_03_coupon = "3학년쿠폰_id";

    public EtoosMember(String id, String couponId) {
        this.id = id;
        this.couponId = couponId;
    }

    public static EtoosMember getCouponId(String id){
//        return new EtoosMember(id,EtoosMember.grade_03_coupon);
        return null;
    }

    public String getCouponId() {
        return couponId;
    }
}
