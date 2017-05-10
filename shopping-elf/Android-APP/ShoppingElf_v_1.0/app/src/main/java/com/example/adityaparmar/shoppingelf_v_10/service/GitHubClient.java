package com.example.adityaparmar.shoppingelf_v_10.service;

import com.example.adityaparmar.shoppingelf_v_10.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by adityaparmar on 5/8/17.
 */

public interface GitHubClient {
    @GET("/inventory/list/rash")
    Call<List<GitHubRepo>> reposForUser();
}
