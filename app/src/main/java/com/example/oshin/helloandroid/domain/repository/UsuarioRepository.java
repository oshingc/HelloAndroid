package com.example.oshin.helloandroid.domain.repository;


import android.database.Observable;

import com.example.oshin.helloandroid.domain.Usuario;

import java.util.List;

/**
 * Created by oshin on 06/05/15.
 */
public interface UsuarioRepository {
    /**
     * Get an {@link rx.Observable} which will emit a List of {@link Usuario}.
     */
    Observable<List<Usuario>> getUsers();

    /**
     * Get an {@link rx.Observable} which will emit a {@link Usuario}.
     *
     * @param userId The user id used to retrieve user data.
     */
    Observable<Usuario> getUser(final int userId);
}