package uz.train.modelappbookingflights.createDto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightsCreateDto {
    @NotNull
    private String name;
    @NotNull
    private Integer trainId;
    @NotNull
    private LocalDate startTime;
    @NotNull
    private LocalDate entTime;
    @NotNull
    private LocalDate flightDate;

}
