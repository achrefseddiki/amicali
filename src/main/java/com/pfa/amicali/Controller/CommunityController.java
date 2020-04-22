package com.pfa.amicali.Controller;

import com.pfa.amicali.Entity.Community;
import com.pfa.amicali.Service.Commuity.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/community")
public class CommunityController {


    @Autowired
    private CommunityService communityService;

    @GetMapping(value = "/show")
    public List<Community> getSubscribers() {

        List<Community> communities = communityService.read();

        return communities;
    }


    @GetMapping(value = "/show/{id}")
    public Optional<Community> getSubscribers(@PathVariable Long id) {

        Optional<Community> community = communityService.read(id);

        return community;
    }

    @PostMapping(path= "/add")
    public void creatSubscriber(@RequestBody Community community){
        communityService.create(community);

    }

    @DeleteMapping("/delete/{id}")
    public List<Community> cancelRegistration(@PathVariable long id) {
        communityService.delete(id);
        return communityService.read();
    }


}
