package com.compass.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.compass.board.model.Board;
public interface BoardRepository extends JpaRepository<Board, Long>{

}
