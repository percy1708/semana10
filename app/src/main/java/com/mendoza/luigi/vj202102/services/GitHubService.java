package com.mendoza.luigi.vj202102.services;

import com.mendoza.luigi.vj202102.entities.Repository;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    @GET("users")
    Call<List<Repository>> allRepos();





}
