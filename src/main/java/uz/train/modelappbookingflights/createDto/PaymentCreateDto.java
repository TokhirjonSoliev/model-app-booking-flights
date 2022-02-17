package uz.train.modelappbookingflights.createDto;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentCreateDto {
    @NotNull
    private String name;
    @NotNull
    private String cardNumber;
    @NotNull
    private String expiryDate;
    @NotNull
    private LocalDate issuedDate;

}
