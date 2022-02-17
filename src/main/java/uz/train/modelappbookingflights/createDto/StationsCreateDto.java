package uz.train.modelappbookingflights.createDto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StationsCreateDto {
    @NotNull
    private String cityId;
    @NotNull
    private String name;
    @NotNull
    private String details;

}
