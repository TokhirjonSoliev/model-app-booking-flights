package uz.train.modelappbookingflights.Dto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WagonDto {
    @NotNull
    private Integer wagonNumber;

}
