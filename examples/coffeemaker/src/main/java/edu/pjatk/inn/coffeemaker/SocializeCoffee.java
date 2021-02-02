import sorcer.service.Context;
import sorcer.service.ContextException;
import java.rmi.RemoteException;

public interface SocialCoffeeMaker{

    public Context rateRecipe(Context context) throws RemoteException, ContextException;

    public Context recommendRecipe(Context context) throws RemoteException, ContextException;

    public Context findRecipe(Context context) throws RemoteException, ContextException;
}