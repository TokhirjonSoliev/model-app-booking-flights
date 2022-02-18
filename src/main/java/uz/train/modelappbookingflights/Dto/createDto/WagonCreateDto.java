package uz.train.modelappbookingflights.Dto.createDto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WagonCreateDto {
    @NotNull
    private Integer trainId;
    @NotNull
    private Integer wagonNumber;

}
