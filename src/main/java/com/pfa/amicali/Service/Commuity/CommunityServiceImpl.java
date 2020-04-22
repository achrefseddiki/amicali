package com.pfa.amicali.Service.Commuity;

import com.pfa.amicali.Entity.Community;
import com.pfa.amicali.Repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommunityServiceImpl implements CommunityService {


    @Autowired
    private CommunityRepository communityRepository;


    @Override
    public void create(Community community) {
        communityRepository.save(community);

    }

    @Override
    public void update(Community community) {
        communityRepository.save(community);

    }

    @Override
    public void delete(Community community) {
        communityRepository.delete(community);
    }

    @Override
    public void delete(Long id) {
        communityRepository.deleteById(id);

    }

    @Override
    public Optional<Community> read(Long id) {
        return communityRepository.findById(id);
    }

    @Override
    public List<Community> read() {
        return communityRepository.findAll();
    }
}
