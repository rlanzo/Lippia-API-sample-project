package api.model;

import java.util.List;

public class BaseServices {
    public static final ThreadLocal<String> API_KEY_INTEGRADOR = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_WORKSPACE_INTEGRADOR = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_USER_INTEGRADOR = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_PROJECT = new ThreadLocal<String>();
    public static final ThreadLocal<String> NAME_HOURS = new ThreadLocal<String>();

    public static final ThreadLocal<String> START_HOURS = new ThreadLocal<String>();
    public static final ThreadLocal<String> END_HOURS = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_EDIT_HOURS = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_DELETE_HOURS = new ThreadLocal<String>();


}
