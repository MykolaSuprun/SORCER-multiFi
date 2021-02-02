import sorcer.service.Context;
import sorcer.service.ContextException;
import java.rmi.RemoteException;

public interface SocializeCoffee{

    public Context payForYourself(Context context) throws RemoteException, ContextException;

    public Context giftCoffee(Context context) throws RemoteException, ContextException;

    public Context buyMostRecommended(Context context) throws RemoteException, ContextException;
}