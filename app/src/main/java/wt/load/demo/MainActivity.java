package wt.load.demo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.wt.load.container.core.WTLoadContainerView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.wt_load_container1) WTLoadContainerView wtLoadContainer1;
    @Bind(R.id.wt_load_container2) WTLoadContainerView wtLoadContainer2;
    @Bind(R.id.wt_load_container3) WTLoadContainerView wtLoadContainer3;
    private Handler handler1 = new Handler();
    private Handler handler2 = new Handler();
    private Handler handler3 = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    @Override protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }

    private void init() {
        wtLoadContainer1.setLoadContainerActionListener(new WTLoadContainerView.LoadContainerActionListener() {
            @Override public void onNetWorkErrorViewClick(WTLoadContainerView view) {

            }

            @Override public void onNoDataViewClick(WTLoadContainerView view) {

            }
        });
        wtLoadContainer2.setLoadContainerActionListener(new WTLoadContainerView.LoadContainerActionListener() {
            @Override public void onNetWorkErrorViewClick(WTLoadContainerView view) {

            }

            @Override public void onNoDataViewClick(WTLoadContainerView view) {

            }
        });
        wtLoadContainer3.setLoadContainerActionListener(new WTLoadContainerView.LoadContainerActionListener() {
            @Override public void onNetWorkErrorViewClick(WTLoadContainerView view) {

            }

            @Override public void onNoDataViewClick(WTLoadContainerView view) {

            }
        });

        handler1.postDelayed(new Runnable() {
            @Override public void run() {
                wtLoadContainer1.showDataView();
            }
        }, 2000);
        handler2.postDelayed(new Runnable() {
            @Override public void run() {
                wtLoadContainer2.showNoDataView();
            }
        }, 4000);
        handler3.postDelayed(new Runnable() {
            @Override public void run() {
                wtLoadContainer3.showNetErrorView();
            }
        }, 6000);
    }
}
