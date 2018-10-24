package org.depromeet.fill_day.repository;

import org.depromeet.fill_day.domain.entity.Timeline;
import org.depromeet.fill_day.domain.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, String> {
}
