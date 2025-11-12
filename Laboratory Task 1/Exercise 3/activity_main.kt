<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/main"
    android:orientation="vertical"
    android:gravity="center"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/instruction"
        android:textColor="@color/black"
        android:textSize="18sp"
        android:textStyle="bold"
        android:layout_marginBottom="20dp"/>

    <EditText
        android:id="@+id/editTextText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:autofillHints="name"
        android:background="@android:color/transparent"
        android:inputType="text"
        android:minHeight="48dp"
        android:layout_marginStart="-30dp"
        android:layout_marginBottom="30dp"
        android:text="@string/Name"
        tools:ignore="LabelFor"
        android:ems="10"/>

    <AutoCompleteTextView
        android:id="@+id/autoCompleteTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="-30dp"
        android:layout_marginTop="-40dp"
        android:background="@android:color/transparent"
        android:completionThreshold="1"
        android:minHeight="48dp"
        android:inputType="text"
        android:text="@string/City"
        android:ems="10"
        tools:ignore="LabelFor" />

    <Spinner
        android:id="@+id/spinner"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="85dp"
        android:layout_marginTop="-40dp"
        android:minHeight="48dp" />
</LinearLayout>
