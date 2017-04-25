package io.github.mezk.model;

public class User {

    private String id;
    private String login;
    private String password;
    private String helloMsg;

    public User(String id, String login, String password, String helloMsg) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.helloMsg = helloMsg;
    }

    public String getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getHelloMsg() {
        return helloMsg;
    }
}
