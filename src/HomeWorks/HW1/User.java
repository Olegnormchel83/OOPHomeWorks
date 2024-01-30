package HomeWorks.HW1;

public class User {
    private Basket basket;
    private String userLogin;
    private String userPassword;

    public User(String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.basket = new Basket();
    }

    public User() {
    }

    public Basket getBasket() {
        return basket;
    }

    public String getUserLogin() {
        return userLogin;
    }
}
