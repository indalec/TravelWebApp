package dci.j24e01.TravelBlog.repository;

import dci.j24e01.TravelBlog.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
