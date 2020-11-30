package lesson7;

public final class ApplicationGlobalState {
    private static ApplicationGlobalState INSTANCE;
    private  String selectedCity =null;
    private final String API_KEY ="YJgKIzS2d81GEHZ5a0ahB5HQdmDF2LSr";

    private ApplicationGlobalState(){

    }
    public  static  ApplicationGlobalState getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }
        return  INSTANCE;
    }
    public  String  getSelectedCity() {
        return  selectedCity;
    }
    public  void  setSelectedCity(String selectedCity) {
        this.selectedCity=selectedCity;
    }
    public String getAPIKEY() {
        return this.API_KEY;
    }
}
