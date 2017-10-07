import android.app.Application;
import android.util.Log;

public class Aplicacion extends Application {
    private static final String tag = Aplicacion.class.getName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(tag,"Entra a la class aplication");
    }
}
