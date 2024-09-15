package login_app.models;

public class Profile {
    String namaLengkap;
    int umur;
    String hobby;
    String nickname;

    public Profile() {}

    public Profile(String namaLengkap, Integer umur, String hobby) {
        this.namaLengkap = namaLengkap;
        this.umur = umur;
        this.hobby = hobby;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getNickName() {
        return nickname;
    }    
    public void setNickName(String nickname) {
        this.nickname = nickname;
    }
}
