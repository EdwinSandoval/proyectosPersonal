package com.pragma.usuarioservice.domain.api;

import com.pragma.usuarioservice.domain.model.UsuarioModel;

import java.util.List;

public interface IUsuarioServicePort {

    UsuarioModel saveUsers(UsuarioModel usuarioModel);

    List<UsuarioModel> getAllUsers();

    UsuarioModel getUserId(Long idUser);
    void actualizarUser(UsuarioModel usuarioModel);

    UsuarioModel buscarUsuarioId(Long id);

}
