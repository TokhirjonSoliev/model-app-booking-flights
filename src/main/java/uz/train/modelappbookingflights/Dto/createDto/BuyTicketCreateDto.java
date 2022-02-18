package uz.train.modelappbookingflights.Dto.createDto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BuyTicketCreateDto {
    @NotNull
    private Integer fromPlaceId;
    @NotNull
    private Integer toPlaceId;
    @NotNull
    private Integer flightId;
    @NotNull
    private UUID passengerId;
    @NotNull
    private LocalDate flightDate;
}
