package com.pranvi.movie_review_system.Service;

import com.pranvi.movie_review_system.Model.User;
import com.pranvi.movie_review_system.Model.UserPrincipal;
import com.pranvi.movie_review_system.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepo.findByUsername(username);
        if (user==null){
            throw  new UsernameNotFoundException("invalid user");
        }
        else return new UserPrincipal(user);

    }
}
