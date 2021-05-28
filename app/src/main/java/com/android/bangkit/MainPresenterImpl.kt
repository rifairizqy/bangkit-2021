package com.android.bangkit

class MainPresenterImpl(
    private val view: MainContract.View
) : MainContract.Presenter {

    override fun doWork() {
        while (true) {
            view.showToast("hello world")
        }
    }
}