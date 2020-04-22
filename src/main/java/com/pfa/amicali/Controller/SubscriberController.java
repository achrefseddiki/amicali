package com.pfa.amicali.Controller;

import com.pfa.amicali.Entity.Subscriber;
import com.pfa.amicali.Service.Subscriber.SubscriberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class SubscriberController {


    @Autowired
    private SubscriberServiceImpl subscriberService;

    @GetMapping(value = "/subscribers")
    public List<Subscriber> getSubscribers() {

        List<Subscriber> subscribers = subscriberService.read();

        return subscribers;
    }


    @GetMapping(value = "/subscribers/{id}")
    public Optional<Subscriber> getSubscribers(@PathVariable Long id) {

        Optional<Subscriber> subscribers = subscriberService.read(id);

        return subscribers;
    }

    @PostMapping(path= "/add/sub")
    public void creatSubscriber(@RequestBody Subscriber subscriber){
        subscriberService.create(subscriber);

    }

    @DeleteMapping("/delete/{id}")
    public List<Subscriber> cancelRegistration(@PathVariable long id) {
        subscriberService.delete(id);
        return subscriberService.read();
    }


}
