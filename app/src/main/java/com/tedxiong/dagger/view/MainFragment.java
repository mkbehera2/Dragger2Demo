package com.tedxiong.dagger.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tedxiong.dagger.MainActivity;
import com.tedxiong.dagger.MultiConstruct;
import com.tedxiong.dagger.R;
import com.tedxiong.dagger.ToastUtil;
import com.tedxiong.dagger.di.components.MainFragmentComponent;
import com.tedxiong.dagger.presenter.MainPresenter;

import javax.inject.Inject;

public class MainFragment extends BaseFragment implements MainPresenter.IUserView {

    @Inject
    MainPresenter mainPresenter;
    @Inject
    ToastUtil toastUtil;

    @Inject
    MultiConstruct multiConstruct;

    private MainFragmentComponent mainFragmentComponent;

    public MainFragmentComponent getMainFragmentComponent() {
        return mainFragmentComponent;
    }

    private OnFragmentInteractionListener mListener;

    public MainFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof MainActivity) {
            mainFragmentComponent = ((MainActivity) getActivity()).getMainComponent().mainFragmentComponent();
            mainFragmentComponent.inject(this);
            mainPresenter.setUserView(this);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        view.findViewById(R.id.get_user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.getUser();
            }
        });
        view.findViewById(R.id.show_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastUtil.showToast("依赖注入获取到的toast");
            }
        });

        return view;
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }


    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void setUserName(String name) {
        ((TextView) getView().findViewById(R.id.user_info)).setText(name);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
