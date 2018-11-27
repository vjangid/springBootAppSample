package com.dcf.repository;

import com.dcf.domain.DcfCheck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.List;

@Repository
public interface DcfCheckRepository extends CrudRepository<DcfCheck, Long> {

    @Nullable
    List<DcfCheck> findById(@Nullable long checkId);

    @Nullable
    List<DcfCheck> findByIdAndActive(@Nullable long checkId);

    long countByActive(@Nullable Boolean active);

    long deleteByActive(boolean active);

    List<DcfCheck> removeByName(@NotNull String name);
}
