package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }
    },
        CONSULTAR_HORAS {
            @Override
            public Class<?> getEntityService() {
                return ConsultarHorasService.class;
            }
        },
    AGREGAR_HORAS {
        @Override
        public Class<?> getEntityService() {
            return AddHorasService.class;
        }
    },
    EDITAR_HORAS {
        @Override
        public Class<?> getEntityService() {
            return CambiarHorasService.class;
        }
    },
    ELIMINAR_HORAS {
        @Override
        public Class<?> getEntityService() {
            return BorrarHorasService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



