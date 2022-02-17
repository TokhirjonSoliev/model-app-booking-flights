package uz.train.modelappbookingflights.createDto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeatCreateDto {
    @NotNull
    private Integer wagonId;
    @NotNull
    private Integer seatNumber;
    @NotNull
    private double seatPrice;
    @NotNull
    private boolean seatStatus;

}
