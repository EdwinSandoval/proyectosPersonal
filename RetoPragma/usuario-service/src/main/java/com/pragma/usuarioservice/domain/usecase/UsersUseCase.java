package com.pragma.usuarioservice.domain.usecase;

import com.pragma.usuarioservice.domain.api.IUsuarioServicePort;
import com.pragma.usuarioservice.domain.model.UsuarioModel;
import com.pragma.usuarioservice.domain.spi.IUsuarioPersistencePort;
import com.pragma.usuarioservice.infraestructure.security.IEncryptPassword;

import java.util.List;

public class UsersUseCase  implements IUsuarioServicePort {
    private final IUsuarioPersistencePort usuarioPersistencePort;//elemento que va a implementar nuestro puerto de persistencia
    private final IEncryptPassword encryptPassword;

    public UsersUseCase(IUsuarioPersistencePort usuarioPersistencePort, IEncryptPassword encryptPassword) {
        this.usuarioPersistencePort = usuarioPersistencePort;
        this.encryptPassword = encryptPassword;

    }

    @Override
    public UsuarioModel saveUsers(UsuarioModel usuarioModel) {
        String encoderPassword=encryptPassword.encryptPassword(usuarioModel.getClave());
        usuarioModel.setClave(encoderPassword);
        return  usuarioPersistencePort.saveUsers(usuarioModel);
    }

    @Override
    public List<UsuarioModel> getAllUsers() {
        return usuarioPersistencePort.getAllUsers();
    }


    @Override
    public UsuarioModel getUserId(Long id) {
        return usuarioPersistencePort.getUserId(id);
    }

    @Override
    public void actualizarUser(UsuarioModel usuarioModel) {
        UsuarioModel usuario=buscarUser(usuarioModel);
        UsuarioModel usuarioModelNew=new UsuarioModel();

        usuarioModelNew.setId(usuario.getId());
        usuarioModelNew.setNombre(usuarioModel.getNombre());
        usuarioModelNew.setApellido(usuarioModel.getApellido());
        usuarioModelNew.setCelular(usuario.getCelular());
        usuarioModelNew.setCorreo(usuario.getCorreo());
        usuarioModelNew.setClave(usuario.getClave());
        usuarioModelNew.setDni(usuario.getDni());
        usuarioModelNew.setRol(usuario.getRol());


        usuarioPersistencePort.actualizarUser(usuarioModelNew);

    }

    private UsuarioModel buscarUser(UsuarioModel usuarioModel){
        return usuarioPersistencePort.buscarUserId(usuarioModel.getId());

    }

    @Override
    public UsuarioModel buscarUsuarioId(Long id) {
        return usuarioPersistencePort.buscarUserId(id);
    }


//
//    @Override
//    public boolean deleteUser(Long userId) {
//        return getUserId(userId).map(user->{
//            usuarioPersistencePort.deleteUser(userId);
//            return true;
//        }).orElse(false);
//        if (getUserId(userId).isPresent()){
//            usuarioPersistencePort.deleteUser(userId);
//            return true;
//        }else return false;
//    }


}
