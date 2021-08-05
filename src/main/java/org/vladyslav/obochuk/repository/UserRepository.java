package org.vladyslav.obochuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vladyslav.obochuk.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
