package uz.pdp.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.model.BaseModel;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users extends BaseModel {
            private  String  name;
            private String  email;
            private  String lastname;
            private String password;
            private UserRole role;

}
