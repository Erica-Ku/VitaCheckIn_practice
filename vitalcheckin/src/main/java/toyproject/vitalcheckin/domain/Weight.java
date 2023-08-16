package toyproject.vitalcheckin.domain;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Weight {
    @Id
    private String userId;
    @NotNull
    private int weight;
    @NotNull
    private int height;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @NotNull
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime time;
}
