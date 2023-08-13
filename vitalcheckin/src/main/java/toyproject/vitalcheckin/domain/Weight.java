package toyproject.vitalcheckin.domain;

import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Weight {
    @Id
    private String userId;
    private int weight;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @NotNull
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime time;
}
