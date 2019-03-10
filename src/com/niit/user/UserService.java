package com.niit.user;

public class UserService {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean userLogin(User user){

        if (user.getAccount().equals("admin")&&user.getPassword().equals("111")){
            return true;
        }else {
            return false;
        }

    }
}
