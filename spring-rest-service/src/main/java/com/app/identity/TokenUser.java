package com.app.identity;

import com.app.entity.User;
import org.springframework.security.core.authority.AuthorityUtils;

public class TokenUser extends org.springframework.security.core.userdetails.User {
    private User user;

    //For returning a normal user
    public TokenUser(User user) {
        // TODO: for plain password
        super( user.getUserId(), "{noop}"+ user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()  )  );
        //super(user.getUserName(), user.getPassword(), true, true, true, true,  AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String getRole() {
        return user.getRole().toString();
    }
}
