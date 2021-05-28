package com.android.bangkit

interface MainContract {

    interface Presenter {

        fun doWork()
    }

    interface View {
        fun showToast(message: String)
    }
}