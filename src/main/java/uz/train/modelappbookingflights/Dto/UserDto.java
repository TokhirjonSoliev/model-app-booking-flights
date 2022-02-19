package uz.train.modelappbookingflights.Dto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    @NotNull
    private String phoneNumber;
    @NotNull
    private String password;
    @NotNull
    private String userRole;

}
