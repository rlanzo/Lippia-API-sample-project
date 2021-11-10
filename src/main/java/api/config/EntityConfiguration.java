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
            return AddHorasService.class;
        }
    },
    EDITARRHORAS {
        @Override
        public Class<?> getEntityService() {
            return CambiarHorasService.class;
        }
    },
    ELIMINARRHORAS {
        @Override
        public Class<?> getEntityService() {
            return BorrarHorasService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



