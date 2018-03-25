package br.edu.ifrs.canoas.tads.tcc.repository;

import br.edu.ifrs.canoas.tads.tcc.domain.Evaluation;
import br.edu.ifrs.canoas.tads.tcc.domain.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {

    Grade findLastByDocumentIdAndAppraiserId(Long documentId, Long professorId);

}