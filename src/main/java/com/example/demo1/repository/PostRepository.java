package com.example.demo1.repository;

import com.example.demo1.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
    // 추가적으로 커스텀 쿼리 메서드가 필요하면 여기에 정의
    PostEntity findByEmail(String email);
}
