import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RobotoTest {
    @Test
        void ifYouSaluteRobotoSaluteBack (){
        SaluteRoboto salute = new SaluteRoboto();
        String answer = salute.answer("Hola Roboto");
        assertThat(answer,equalTo("Hola"));
    }
}

