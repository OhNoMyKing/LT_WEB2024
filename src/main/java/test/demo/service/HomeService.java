package test.demo.service;

import test.demo.entity.Home;

import test.demo.entity.Home;

import java.util.List;
import java.util.Optional;

public interface HomeService {


    List<Object[]> findHomeService(String listingtypes, String offertype, String selectcity);
    List<Home> getAllHome();
    Home getHomeById(Long id);
    Home addHome(Home home);
    Home updateHome(Home home);
    void Delete(Long id);
}