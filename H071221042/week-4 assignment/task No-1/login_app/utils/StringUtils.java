package login_app.utils;

import java.util.jar.Attributes.Name;

import login_app.Main;
import login_app.models.Profile;

public class StringUtils {
    public static String setNickName(String fullName){
        String[] panjangNick = fullName.split(" ");
        if (panjangNick.length == 1){
            return fullName;
        }else if (panjangNick.length == 2){
            return panjangNick[1];
        }else{
            return panjangNick[1];
        }
    }

    /*
     TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     public static void(){
         String nickName= 
        }
        */
}