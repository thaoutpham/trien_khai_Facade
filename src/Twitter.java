public class Twitter implements SocialShare {
private String mesage;
    @Override
    public void setMessage(String message) {
        this.mesage=message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Twitter:"+ this.mesage);
    }
}

