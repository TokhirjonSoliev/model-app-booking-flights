package uz.train.modelappbookingflights.Dto.createDto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreateDto {
    @NotNull
    private String phoneNumber;
    @NotNull
    private String password;
    @NotNull
    private String userRole;

}
