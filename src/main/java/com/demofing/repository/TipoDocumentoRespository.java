package com.demofing.repository;

import com.demofing.entity.TipoDumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocumentoRespository extends JpaRepository<TipoDumentoEntity, Long> {
}
