package login_app.models;

public class Profile {
    private String nama;
    private int umur;
    private String hobby;
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getHobby() {
        return hobby;
    }
}