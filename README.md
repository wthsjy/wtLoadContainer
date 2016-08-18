# wtLoadContainer
###  可配置不同状态的子布局的（ 加载中，没有数据，网络错误） 自定义View


```gradle

dependencies {
 compile 'com.wt.load.container.core:wtLoadContainerCore:0.11'
}
```

###Demo
[![apk demo](https://github.com/mw258176257/wtLoadContainer/blob/master/buildSystem/qr_demo.png)]

###用法
```
<com.wt.load.container.core.WTLoadContainerView
                android:id="@+id/wt_load_container1"
                android:layout_width="match_parent"
                android:layout_height="100dp"
                app:childDataViewId="@+id/child01"
                app:dataLoadingView="@layout/wt_load_detault_data_loading_view"
                app:networkErrorView="@layout/wt_load_detault_network_error_view"
                app:noDataView="@layout/wt_load_detault_no_data_view"
                app:showLoadingViewInitialize="true">

                <TextView
                    android:id="@+id/child01"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:text="Large Text11"
                    android:textAppearance="?android:attr/textAppearanceLarge"/>

            </com.wt.load.container.core.WTLoadContainerView>
```

