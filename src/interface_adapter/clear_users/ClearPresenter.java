package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.logged_in.LoggedInViewModel;
import interface_adapter.login.LoginState;
import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ClearPresenter implements ClearOutputBoundary {
    private final SignupViewModel signupViewModel;
    private ViewManagerModel viewManagerModel;

    private ClearViewModel clearViewModel;

    private final LoginViewModel loginViewModel ;
    public void prepareSuccessView(ClearOutputData nice){

        ClearState clearstate = clearViewModel.getState();
        this.clearViewModel.setState(clearstate);
        clearViewModel.firePropertyChanged();
        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    public ClearPresenter(SignupViewModel signupViewModel, ViewManagerModel Viewmanager, LoginViewModel loginViewModel, ClearViewModel clearViewModel) {
        this.signupViewModel = signupViewModel;
        this.viewManagerModel = Viewmanager;
        this.loginViewModel = loginViewModel;
        this.clearViewModel = clearViewModel;
    }
}
