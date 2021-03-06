# AndroidDataBindingTutorial
DataBinding can do lots of things...

# [Advanced Data Binding - Google I/O 2016](https://www.youtube.com/watch?v=DAmMN7m3wLU)
## [DataBindingTutorial-CN](https://yanlu.me/android-databinding-tutorial-00/)

# WARNING
* Data Binding does not support Jack
> Error:Data Binding does not support Jack builds yet  

# Feature
The following features is presented:
```
Simple usage in Activity(clickListener,map)
LoadImage(ImageView imageView, String url, Drawable error)
Data binding in Fragment
Data binding in RecyclerView
Data binding in ViewPage
Data binding with ObservableField
Data binding with extends BaseObservable
Data binding with implements Observable
Reverse Data Binding
```

# good practices
``` xml
android:onClick="@{() -> onClickEvent.onClick()}"
android:onClick="@{(v) -> selectedClick.onClick(v, info)}"
android:onCheckedChanged="@{(cb, isChecked) -> presenter.completeChanged(t, isChecked)}"
<!-- view with the id as a variable -->
android:visibility="@{tvView.visibility}"

<import type="android.databinding.ObservableBoolean"/>
<variable name="isVisible" type="ObservableBoolean"/>
// use isVisible.get the value
app:isVisibleOrGone="@{!(isVisible.get)}

<!-- Expression Language: and &&  -->
app:isVisibleOrGone="@{!TextUtils.isEmpty(userName) &amp;&amp; isVisible}"

<!-- 2-way Data Binding -->
android:text="@={defValue}"
```

### Data binding in RecyclerView 
![data-binding-recycle-view](https://raw.githubusercontent.com/captain-miao/me.github.com/master/databinding/data-binding-recycle-view.gif "data-binding-recycle-view")

### Data binding in ViewPage 
![data-binding-view-page](https://raw.githubusercontent.com/captain-miao/me.github.com/master/databinding/data-binding-view-page.gif "data-binding-view-page")

<br/>

# License

This project is licensed under the terms of the MIT license.
