package ru.hogwarts.school.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school.model.Faculty;
@Repository
public interface repositoryFaculty extends JpaRepository<Faculty, Long> {
}
