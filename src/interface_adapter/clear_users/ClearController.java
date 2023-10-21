package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

// TODO Complete me
public class ClearController {
    static ClearInputBoundary userClearInteractor;

    public ClearController(ClearInputBoundary newp) {
        ClearController.userClearInteractor = newp;}

    public void execute(boolean state) {
        userClearInteractor.execute(state);
    }



    }

