package azure.test.testing.Azure.web.service.Web;

import azure.test.testing.Azure.web.service.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebController {
    @GetMapping()
    public ResponseEntity<Person> getPerson(){
        Person person=new Person("Franco","McDonals",23);
        return ResponseEntity.ok(person);
    }
}
