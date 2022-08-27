package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.repository.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository deliverRepository;

    //Definindo que somente os usuários com as roles abaixo possam acessar o método.
    //Definimos uma anotação na classe de configuração WebSecurityConfig.
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_INSTRUCTOR')")
    @Transactional
    public void save(Long id, DeliverRevisionDTO deliverRevisionDTO) {
        Deliver deliver = deliverRepository.getReferenceById(id);
        deliver.setStatus(deliverRevisionDTO.getStatus());
        deliver.setFeedback(deliverRevisionDTO.getFeedback());
        deliver.setCorrectCount(deliverRevisionDTO.getCorrectCount());
        deliverRepository.save(deliver);
    }
}