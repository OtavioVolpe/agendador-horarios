package com.volpe.agendador_horarios.infrastructure.repository;

import com.volpe.agendador_horarios.infrastructure.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public class AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
