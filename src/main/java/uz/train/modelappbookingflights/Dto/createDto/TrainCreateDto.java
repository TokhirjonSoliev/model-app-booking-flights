package uz.train.modelappbookingflights.Dto.createDto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrainCreateDto {
    @NotNull
    private String name;
    @NotNull
    private String fromCityId;
    @NotNull
    private String toCityId;
    @NotNull
    private String trainNumber;
    @NotNull
    private String includePlaces;

}
