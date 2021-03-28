import java.util.Optional;
import static org.junit.Assert.assertTrue;

public class EtoosMemberCallTest {
    public static void main(String[] args) {

        EtoosMember etoosMember = EtoosMember.getCouponId("1");

//        Optional<EtoosMember> etoosMember01 = Optional.of(etoosMember);
        Optional<EtoosMember> etoosMember01 = Optional.ofNullable(etoosMember);

        //assertTrue(etoosMember01.isPresent());

        etoosMember01.ifPresent(result -> System.out.println(result.getCouponId()));

        if(etoosMember01!=null || etoosMember01.isEmpty()){

        }
//        if(etoosMember01.isPresent()){
//            System.out.println("객체있음");
//        }
    }
}
