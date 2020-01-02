package com.compass.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.compass.board.model.Point;

public interface PointRepository extends JpaRepository<Point, Long> {
}