package uz.train.modelappbookingflights.Dto.createDto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CityCreateDto {
    @NotNull
    private Integer cityNumber;
    @NotNull
    private String cityName;

}
