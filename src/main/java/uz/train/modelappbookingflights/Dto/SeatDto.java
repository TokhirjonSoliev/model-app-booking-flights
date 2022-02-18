package uz.train.modelappbookingflights.Dto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeatDto {
    @NotNull
    private Integer seatNumber;
    @NotNull
    private double seatPrice;
    @NotNull
    private boolean seatStatus;

}
