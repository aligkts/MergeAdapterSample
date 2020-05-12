package com.aligkts.mergeadaptersample

import android.graphics.Color

/**
 * Created by Ali Göktaş on 07,May,2020
 */
object MergeAdapterDataSource {

    fun getHeader() = Header(Color.BLUE, "RECYCLERVIEW")

    fun getTitle() = Title("Merge Adapter")

    fun getImage() = Image(R.drawable.placeholder)

}