package com.verde_claro.verde.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Roles_Permisos")
public class RolesPermisos {

    @Id
    private String id;

    @Field("rol_id")
    private Integer rol_id;

    @Field("permiso_id")
    private Integer permiso_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }

    public Integer getPermiso_id() {
        return permiso_id;
    }

    public void setPermiso_id(Integer permiso_id) {
        this.permiso_id = permiso_id;
    }
}
