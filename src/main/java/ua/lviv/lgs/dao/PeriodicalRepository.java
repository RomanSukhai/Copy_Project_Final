package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.domain.Periodical;

public interface PeriodicalRepository extends JpaRepository<Periodical, Integer>{

}
