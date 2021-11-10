package api.model;


public class BaseServices {
    public static final ThreadLocal<String> API_KEY= new ThreadLocal<String>();
    public static final ThreadLocal<String> WORKSPACE_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> USER_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> PROJECT_ID = new ThreadLocal<String>();



}
