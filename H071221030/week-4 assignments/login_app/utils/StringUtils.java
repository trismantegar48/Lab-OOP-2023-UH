    package login_app.utils;

    import java.lang.reflect.Array;

    public class StringUtils {
        public static String getNickName(String namaLengkap) {
            String[] nickname = namaLengkap.split(" ");
            if (nickname.length > 1) {
                return nickname[1];
            } else {
                return nickname[0];
            }
        }
    }
