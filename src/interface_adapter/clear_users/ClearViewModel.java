package interface_adapter.clear_users;

// TODO Complete me
import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    public static final String  TITLE_LABEL = "Message";


    public static final String CANCEL_BUTTON_LABEL = "Cancel";

    public static  ClearState state = new ClearState();

    public ClearViewModel() {
        super("sign up");
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    public static ClearState getstate() {
        state.SetClicked();
        return state;}

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, state);
    }


    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {
        return state;
    }
}
