package cs425swemidterm202503hewitt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
    private int id;
    private String fname;
    private String lname;
    private String phoneNumber;
    private String email;
    private String dateOfBirth;
    private String address;
}
