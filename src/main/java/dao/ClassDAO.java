package dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 14/06/2020 - 20:06
 *
 */
@Getter
@Setter
@Component
public class ClassDAO {

    @Autowired
    private ClassJDBC classJDBC;
}
