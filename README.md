# AndroidDataBindingTutorial
DataBinding can do lots of things...

# Feature
The following features is presented:
```
Simple usage in Activity(clickListener,map)
LoadImage(ImageView imageView, String url, Drawable error)
Data binding in Fragment
Data binding in Recyclerview
Data binding in ViewPage
Data binding with ObservableField
Data binding with extends BaseObservable
Data binding with implements Observable

```

# good practices
``` xml
android:onClick="@{() -> onClickEvent.onClick()}"
android:onClick="@{(v) -> selectedCLick.onClick(v, info)}"
android:onCheckedChanged="@{(cb, isChecked) -> presenter.completeChanged(t, isChecked)}"
```

### Data binding in Recyclerview 
![data-binding-recycle-view](https://raw.githubusercontent.com/captain-miao/me.github.com/master/databinding/data-binding-recycle-view.gif "data-binding-recycle-view")

### Data binding in ViewPage 
![data-binding-view-page](https://raw.githubusercontent.com/captain-miao/me.github.com/master/databinding/data-binding-view-page.gif "data-binding-view-page")

<br/>
