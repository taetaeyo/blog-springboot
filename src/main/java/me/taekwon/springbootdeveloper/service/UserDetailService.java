package me.taekwon.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.taekwon.springbootdeveloper.domain.User;
import me.taekwon.springbootdeveloper.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/* UserDetailsService : Spring Security에서 사용자 정보를 가져오는 interface */
@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    /* email로 사용자 정보를 가져오는 메서드 */
    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException((email)));
    }

}
