public class ElektronischeAdresse implements Adresse{
    String mail;

    public ElektronischeAdresse(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return String.format("%s", mail);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
