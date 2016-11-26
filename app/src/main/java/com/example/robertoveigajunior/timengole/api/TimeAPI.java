package com.example.robertoveigajunior.timengole.api;

import com.example.robertoveigajunior.timengole.model.Time;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by robertoveigajunior on 19/11/16.
 */

public interface TimeAPI {
    @GET("v2/")
    Call<List<Time>> findBy(@Path("tipo") String tipo);

}
