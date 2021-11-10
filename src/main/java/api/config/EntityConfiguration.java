package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }
    },
        CONSULTARHORAS {
            @Override
            public Class<?> getEntityService() {
                return ConsultarHorasService.class;
            }
        },
    AGREGARHORAS {
        @Override
        public Class<?> getEntityService() {
            return AgregarHorasService.class;
        }
    },
    EDITARRHORAS {
        @Override
        public Class<?> getEntityService() {
            return EditarHorasService.class;
        }
    },
    ELIMINARRHORAS {
        @Override
        public Class<?> getEntityService() {
            return EliminarHorasService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



