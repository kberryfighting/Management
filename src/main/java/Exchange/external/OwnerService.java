
package Exchange.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="Owner", url="http://Owner:8080")
public interface OwnerService {

    @RequestMapping(method= RequestMethod.GET, path="/owners")
    public void checkExchange(@RequestBody Owner owner);

}